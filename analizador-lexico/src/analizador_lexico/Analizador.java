package analizador_lexico;

public class Analizador {

    /**
     * Palabras reservadas, Operadores simples, Operadores delimitadores 
     */
    String Palabra[] = {"paq", "man", "mana", "kama", "retornar", "iskirbiy", "liyiy", "clase", "central", "entero", "real", "caracter", "palabra", "veracidad", "nuevo",
        "noobvio", "obvio", "inmune", "verdadero", "falso", "vacuo", "konstante"};
    char Simbolo[] = {'&', '|'};
    char Delimitador[] = {',', ';', ':', '(', ')', '{', '}', '[', ']', '"', '^'};

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

}
