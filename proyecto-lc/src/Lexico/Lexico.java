package Lexico;

//Esta clase se usa para averiguar cuál es la palabra reservada. llamando de Gui.java.
import java.util.Vector;

public class Lexico {

    private String text, tr; //guarda el texto
    private boolean validacion;
    private Vector<Token> tokens;
    private Vector<Token> simbolos;

    // Palabras reservadas, Operadores simples, Operadores delimitadores 
        String Palabra[] = {"paq", "man", "mana", "kama", "retornar", "iskirbiy", "liyiy", "clase", "central", "entero", "real", "caracter", "palabra", "bool", "nuevo",
        "noobvio", "obvio", "inmune", "verdadero", "falso", "vacuo", "konstante"};
    char Simbolo[] = {'&', '|'};
    char Delimitador[] = {',', ';', ':', '(', ')', '{', '}', '[', ']', '"', '^'};

    //Constructor
    public Lexico(String text) {
        //text.replace('\t', ' ');
        this.text = text + '$';
        this.tr = text + '$';
        this.validacion = true;
    }

    //Ejecutar
    public void ejecutar() {
        tokens = new Vector<Token>();
        simbolos = new Vector<Token>();
        String line;
        int counterOfLines = 1;
        //  Salto de linea
        int total = lineas(tr);
        do {
            int eolAt = text.indexOf('\n');

            if (eolAt >= 0) {
                line = text.substring(0, eolAt);
                if (text.length() > 0) {
                    text = text.substring(eolAt + 1);
                }
            } else {
                line = text;
                text = "";
            }
            line = line.trim(); //elimina los espacios
            System.out.println(counterOfLines + " : " + line);
            if (!line.equals("") && !line.equals("$")) {
                System.out.println("HG");
                scanner(counterOfLines, line, total);
            }

            counterOfLines++;
        } while (!text.equals(""));
    }

    public int lineas(String texto) {
        String line;
        int counterOfLines = 1;
        do {
            int eolAt = tr.indexOf('\n');

            if (eolAt >= 0) {
                line = tr.substring(0, eolAt);
                if (tr.length() > 0) {
                    tr = tr.substring(eolAt + 1);
                }
            } else {
                line = tr;
                tr = "";
            }
            counterOfLines++;
        } while (!tr.equals(""));
        return counterOfLines - 1;
    }

    public String R_I(String texto) {
        if (_Palabra(texto) != 300) {
            return "Reservada";
        } else {
            return "Identificador";
        }
    }

    private void scanner(int row, String cadena, int total) {
        String buffer = " ";
        char caracter;
        int indicador = 0, estado = 0;
        int flag = 0;

        do {
            caracter = cadena.charAt(indicador); //quita letra por letra caracter la cadena

            if (caracter == '$') {
                switch (estado) {
                    case 1:
                        tokens.add(new Token(buffer, R_I(buffer), _Palabra(buffer), row)); // Palabra reservada(200) o Identificador retorna(300)
                        simbolos.add(new Token(_Palabra(buffer), buffer, R_I(buffer))); 
                        flag = 1;
                        break;
                    case 2:
                        tokens.add(new Token(buffer, "Operador", 100, row)); // operador >
                        flag = 1;
                        break;
                    case 3:
                        tokens.add(new Token(buffer, "Operador", 500, row)); // literal numero
                        flag = 1;
                        break;
                    case 4:
                        tokens.add(new Token(buffer, "400", 400, row));  //op.delimitador
                        flag = 1;
                        break;
                    case 5:
                        tokens.add(new Token(buffer, "Literal numerica", 500, row));
                        flag = 1;
                        break;
                    case 6:
                        tokens.add(new Token(buffer, "Operador", 110, row));
                        flag = 1;
                        break;
                    case 7:
                        tokens.add(new Token(buffer, "Operador", 111, row));
                        flag = 1;
                        break;
                    case 8:
                        tokens.add(new Token(buffer, "Operador", 101, row));
                        flag = 1;
                        break;
                    case 9:
                        tokens.add(new Token(buffer, "Operador", 102, row));
                        flag = 1;
                        break;
                    case 10:
                        tokens.add(new Token(buffer, "Operador", 107, row));
                        flag = 1;
                        break;
                    case 11:
                        tokens.add(new Token(buffer, "Char", 102, row));
                        flag = 1;
                        break;
                    case 12:
                        if (buffer.charAt(buffer.length() - 1) == '"' && buffer.length() > 1) {
                            tokens.add(new Token(buffer, "Cadena", 107, row));
                            flag = 1;
                            break;
                        } else {
                            tokens.add(new Token(buffer, "Error", 107, row));
                            validacion = false;
                            flag = 1;
                            break;
                        }

                } // fin switch 
            } else {
                if (estado != 12) {
                    buffer = buffer.trim();
                }

                switch (estado) {

                    case 0:
                        buffer = buffer + caracter;
                        if (Character.isLetter(caracter)) {
                            estado = 1;

                        } else if (Character.isDigit(caracter)) {
                            estado = 3;

                        } else if (Operador(caracter)) {
                            //estado = 2;

                            //indicador++;
                            tokens.add(new Token(buffer, "Operador", _Operador(caracter), row));
                            flag = 1;
                            break;
                        } else if (caracter == '<') {
                            estado = 6;

                        } //si es < analiza si el siguiente en el estado 6 es =  para formar <=
                        else if (caracter == '>') {
                            estado = 7;

                        } //si es >analiza si el siguiente en el estado 6 es = para formar >=
                        else if (caracter == '=') {
                            estado = 10;

                        } //si es = analiza si el siguiente en el estado 6 es = para formar nuestro == asignación
                        else if (caracter == '~') {
                            estado = 11;

                        } //si es ~ analiza si el siguiente en el estado 6 es = para nuestro diferendete de
                        else if (caracter == '+') {
                            estado = 8;

                        } //si es + analiza si el siguiente en el estado 6 es + para nuestro aumento ++
                        else if (caracter == '-') {
                            estado = 9;
                        } else if (caracter == '\'') {
                            estado = 11;
                        } else if (caracter == '"') {
                            estado = 12;

                        } //si es - analiza si el siguiente en el estado 6 es - para nuestra dismunucion --
                        else if (Delimitadores(caracter)) {
                            indicador++;

                            if (caracter == ':' && cadena.charAt(indicador) == ':') {
                                indicador++;

                                //buffer = buffer + cadena.charAt(indicador);
                                if (cadena.charAt(cadena.length() - 1) == '$') {
                                    buffer = buffer + cadena.substring(indicador);
                                    buffer = buffer.substring(0, buffer.length() - 1);

                                    indicador = cadena.length() - 1;
                                } else {
                                    buffer = buffer + cadena.substring(indicador);
                                    indicador = cadena.length();
                                }
                                tokens.add(new Token(buffer, "Comentario", 302, row));
                                //indicador++;
                                flag = 1;
                                break;
                            } else {
                                tokens.add(new Token(buffer, "Delimitador", _Delimitadores(caracter), row));
                                flag = 1;
                                break;
                            }

                        } else if (caracter != ' ') {
                            tokens.add(new Token(buffer, "ERROR", 955, row));// si no reconoce ninguna de las anteriores comparaciones y no es vacio nos retorna cualquier 555 que es un codigo para el default de nuestro metodo jButton3MouseClicked
                            validacion = false;
                            indicador++;
                            flag = 1;
                            break;
                        } else {
                            estado = 0;
                        }
                        break;

                    case 1:
                        if ((Character.isLetter(caracter))) {
                            buffer = buffer + caracter; //va almacenando mi letra o numero hasta que se distinto de letra o numero
                            estado = 1;
                        } else {
                            System.out.println(buffer);
                            tokens.add(new Token(buffer, R_I(buffer), _Palabra(buffer), row));  //me retorna 200(palabra reservada) o 300(identificador)
                            simbolos.add(new Token(_Palabra(buffer), buffer, R_I(buffer))); 
                            flag = 1;
                            break;
                        }

                        break;

                    case 3:
                        if (Character.isDigit(caracter)) {
                            buffer = buffer + caracter;
                            //indicador++;
                            estado = 3;
                        } //si es numero se van acumulando
                        else {
                            if (caracter == '.') {
                                buffer = buffer + caracter;
                                estado = 5;

                            } //si llega un punto pasa al estado 5 para seguir acumulando numeros
                            else {
                                tokens.add(new Token(buffer, "Literal numerica", 500, row));
                                flag = 1;
                                break;
                            }
                        }

                        break;
                    //case 4:  

                    case 5:
                        if (Character.isDigit(caracter)) {
                            buffer = buffer + caracter;
                            estado = 5;

                        } //siguen acumulando numeros despues del punto y no permite que aparesca otro punto 
                        else {
                            tokens.add(new Token(buffer, "Literal numerica", 500, row));
                            indicador--;
                            flag = 1;
                            break;
                        }

                        break;
                    case 6:
                        if (caracter == '=') {
                            buffer = buffer + caracter;
                            indicador++;
                            tokens.add(new Token(buffer, "operador", 112, row));
                            flag = 1;
                            break;
                        } else {
                            if (caracter == '<') {
                                buffer = buffer + caracter;
                                //indicador++;
                                tokens.add(new Token(buffer, "operador", 101, row));
                                flag = 1;
                                break;
                            } else {
                                tokens.add(new Token(buffer, "operador", 100, row));
                                flag = 1;
                                break;
                            }
                        }
                    case 7:
                        if (caracter == '=') {
                            buffer = buffer + caracter;
                            indicador++;
                            tokens.add(new Token(buffer, "Operador", 111, row));
                            flag = 1;
                            break;
                        } else if (caracter == '>') {
                            buffer = buffer + caracter;
                            //indicador++;
                            tokens.add(new Token(buffer, "Operador", 102, row));
                            flag = 1;
                            break;
                        } else {
                            tokens.add(new Token(buffer, "Operador", 100, row));
                            flag = 1;
                            break;
                        }

                    case 8:
                        if (caracter == '+') {
                            buffer = buffer + caracter;
                            indicador++;
                            tokens.add(new Token(buffer, "Operador", 108, row));
                            flag = 1;
                            break;
                        } else {
                            tokens.add(new Token(buffer, "Operador", 101, row));
                            flag = 1;
                            break;
                        }

                    case 9:
                        if (caracter == '-') {
                            buffer = buffer + caracter;
                            //indicador++;
                            tokens.add(new Token(buffer, "Operador", 109, row));
                            flag = 1;
                            break;
                        } else {
                            tokens.add(new Token(buffer, "Operador", 555, row));
                            flag = 1;
                            break;
                        }

                    case 10:
                        if (caracter == '=') {
                            buffer = buffer + caracter;
                            indicador++;
                            tokens.add(new Token(buffer, "Operador", 112, row));
                            flag = 1;
                            break;
                        } else {
                            tokens.add(new Token(buffer, "Operador", 107, row));
                            flag = 1;
                            break;
                        }

                    case 11:
                        if (cadena.charAt(indicador + 1) == '\'') {
                            buffer = buffer + caracter + cadena.charAt(indicador + 1);
                            indicador += 2;
                            tokens.add(new Token(buffer, "char", 112, row));
                            flag = 1;
                            break;
                        } else {
                            buffer = buffer + caracter;
                            indicador++;
                            tokens.add(new Token(buffer, "Error", 107, row));
                            validacion = false;
                            flag = 1;
                            break;
                        }

                    case 12:
                        if (caracter != '$' && caracter != '"' && (Character.isLetter(caracter) || Character.isDigit(caracter) || Operador(caracter) || Delimitadores(caracter) || caracter == ' ')) {
                            buffer = buffer + caracter;
                            //indicador+=2;
                            //tokens.add(new Token(buffer, "char", 112, row));
                            //flag = 1;
                            break;
                        } else if (caracter == '"') {
                            buffer = buffer + caracter;
                            indicador++;
                            tokens.add(new Token(buffer, "cadenas", 112, row));
                            flag = 1;
                        } else {
                            //buffer = buffer + caracter;
                            //indicador++;
                            tokens.add(new Token(buffer, "Error", 107, row));
                            validacion = false;
                            flag = 1;
                            break;
                        }

                }

                if (flag != 1) {
                    indicador++;
                }
            }
        } while (indicador < cadena.length() && flag != 1);

        // loop
        System.out.println(cadena);
        System.out.println("iiii: " + indicador + "|" + cadena.length());
        //System.out.println(cadena.substring(indicador));

        if (row == total && indicador < cadena.length() - 1) {
            scanner(row, cadena.substring(indicador), total);

        } else if (row < total && indicador < cadena.length()) {
            scanner(row, cadena.substring(indicador), total);
        }
    }

    boolean Operador(char OP) {
        int k = 0;
        for (k = 0; k < Simbolo.length; k++) {
            if (OP == Simbolo[k]) { //Busca si es es un operador simple
                return true;
            }
        }
        return false;
    }

    int _Operador(char OP) {
        int k = 0;
        for (k = 0; k < Simbolo.length; k++) {
            if (OP == Simbolo[k]) {
                return 301 + k;
            }
        }
        return 0;
    }

    int _Palabra(String PR) {
        int k = 0;
        for (k = 0; k < Palabra.length; k++) {
            if (PR.equals(Palabra[k])) {
                System.out.println(PR);
                return 200 + k;//me retorna 200, que en jButton3MouseClicked es una palabra reservada  
            }
        }
        return 300;//me retorna 300 si no es palabraReser, que en jButton3MouseClicked es un identificador 
    }

    boolean Delimitadores(char Del) {
        int k = 0;
        for (k = 0; k < Delimitador.length; k++) {
            if (Del == Delimitador[k]) { ///Busca si es es un operador simple
                return true;
            }
        }
        return false;
    }

    int _Delimitadores(char Del) {
        int k = 0;
        for (k = 0; k < Delimitador.length; k++) {
            if (Del == Delimitador[k]) { ///Busca si es es un operador simple
                return 600 + k;
            }
        }
        return 0;
    }

    // es espacio
    private boolean isSpace(char o) {
        return o == ' ' || o == '\t';
    }

    // obtener tokens
    public Vector<Token> getTokens() {
        return tokens;
    }
    
    public Vector<Token> getSimbolos() {
        return simbolos;
    }

    public boolean getValidacion() {
        return validacion;
    }

}
