package Sintactico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import Lexico.Lexico;

public class Parser extends javax.swing.JFrame {

    Tabla t = new Tabla();
    String pila[] = new String[200];
    String Analisis;
    String Mensaje;
    String ae; //guarda un simbolo de la cadena de entrada
    int i; // indice de la pila
    String cad; // guarda la cadena de entrada
    int p; // posicion de un simbolo de la cadena de entrada a leer
    int pos;
    String buffer;
    int ind = 0;
    Lexico A1 = new Lexico("");
    String mostrarAnalisis;

    static String leer(String m) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena = "";
        System.out.println(m);
        try {
            cadena = br.readLine();
        } catch (IOException ioe) {
        }
        return cadena;
    }

    int RetPos() {
        return pos;
    }

    String Lexico() { // regresa un lexema
        String tira = " ";
        int k = 0;
        ind = p;

        tira = Asignar();

        if (tira == null) {
            return tira;
        }
        pos = ind;
        System.out.println("tira*" + tira);
        return tira.trim();

    }

    void mover(int pos) {
        System.out.println("se mueve");
        p = pos;
    }

    void Empilar(String produccion) {// mete en la pila
        String t = "";
        for (int j = 0; j < produccion.length(); j++) {
            if (produccion.charAt(j) != ' ') {
                t = t + produccion.charAt(j);
                pila[i] = t;
                System.out.println("pila" + i + ":" + pila[i]);
            } else {

                i++;
                t = "";
            }
        }
        i++;
    }

    void error() {
        Mensaje = "error de sintaxis";
        System.out.println("error de sintaxis");

    }

    String RetCad() {
        String temp = "";
        int j, k = 0;
        for (j = p; j < cad.length(); j++) {
            temp = temp + cad.charAt(j);
        }
        return temp;
    }

    String RetPila() {
        String CadPila = "";
        for (int j = 0; j < i; j++) {
            CadPila = CadPila + pila[j];
        }
        return CadPila;
    }

    public Parser() {

        pila[0] = "$";
        pila[1] = "<Clases>";
        i = 2;
        p = 0;
    }

    private String Asignar() {
        int t;
        char comillas = '"';
        String comilla = Character.toString(comillas);
        String Palabra = null;

        t = Scanner();
        //De acuerdo al numero retornado por el metodo Scanner pasa por cada uno de los casos y muestra 
        switch (t) {
            case 0:
                Palabra = "$";
                break;
            case 101:
                Palabra = "<";
                break;
            case 102:
                Palabra = ">";
                break;
            case 103:
                Palabra = "=";
                break;
            case 105:
                Palabra = "+";
                break;
            case 106:
                Palabra = "-";
                break;
            case 110:
                Palabra = "~";
                break;
            case 111:
                Palabra = ">=";
                break;
            case 112:
                Palabra = "<=";
                break;
            case 113:
                Palabra = "~=";
                break;
            case 114:
                Palabra = "==";
                break;
            case 115:
                Palabra = "++";
                break;
            case 116:
                Palabra = "--";
                break;
            case 200:
                Palabra = "paq";
                break;
            case 201:
                Palabra = "man";
                break;
            case 202:
                Palabra = "mana";
                break;
            case 203:
                Palabra = "kama";
                break;
            case 204:
                Palabra = "retornar";
                break;
            case 205:
                Palabra = "iskirbiy";
                break;
            case 206:
                Palabra = "liyiy";
                break;
            case 207:
                Palabra = "clase";
                break;
            case 208:
                Palabra = "central";
                break;
            case 209:
                Palabra = "intero";
                break;
            case 210:
                Palabra = "real";
                break;
            case 211:
                Palabra = "caracter";
                break;
            case 212:
                Palabra = "palabra";
                break;
            case 213:
                Palabra = "bool";
                break;
            case 214:
                Palabra = "nuevo";
                break;
            case 215:
                Palabra = "noobvio";
                break;
            case 216:

                Palabra = "obvio";
                break;
            case 217:
                Palabra = "inmune";
                break;
            case 218:
                Palabra = "verdadero";
                break;
            case 219:
                Palabra = "falso";
                break;
            case 220:
                Palabra = "konstante";
                break;
            case 221:
                Palabra = "vacuo";
                break;
            case 300:
                Palabra = "ID";
                break;
            case 301:
                Palabra = "&";
                break;
            case 302:
                Palabra = "*";
                break;
            case 303:
                Palabra = "/";
                break;
            case 304:
                Palabra = "%";
                break;
            case 600:
                Palabra = ",";   
                break;
            case 601:
                Palabra = ";";
                break;
            case 602:
                Palabra = "^";
                break;
            case 603:
                Palabra = "::";
                break;
            case 604:
                Palabra = "(";
                break;
            case 605:
                Palabra = ")";
                break;
            case 606:
                Palabra = "{";
                break;
            case 607:
                Palabra = "}";
                break;
            case 608:
                Palabra = "[";
                break;
            case 609:
                Palabra = "]";
                break;
            case 610:
                Palabra = comilla;
                break;
            case 611:
                Palabra = "|";
                break;
            case 612:
                Palabra = "Ø";
                break;
            case 500:
                Palabra = "NUMERO";
                break;
            default:
                System.out.println(" finalizo por error ");
                System.exit(0);
            //salir=false;
        }
        // System.out.println("PALABRA****= "+Palabra);
        return Palabra;
    }

    int Scanner(){ return 0; } 
    
    private void Analizar(String text) {
        cad = text;
        cad = cad + "$";

        String XX;
        String produccion = "";
        int pos = 0;
        int B = 0;
        mostrarAnalisis = "";
        do {
            //se copian las cadenas retornadas en "ae" y "XX"
            ae = Lexico();
            XX = pila[i - 1];
            pos = RetPos();
            System.out.println("ae: " + ae);
            System.out.println("pila**" + XX);

            if (t.Terminal(XX)) // retorna 1 si XX es terminal, sino 0
            {
                if (XX.equals(ae)) {
                    i = i - 1; // se descuenta un simbolo de la pila
                    mover(pos); // se lee la cadena de entrada desde
                    // la posicion "pos"

                } else {
                    Mensaje = "1";
                    error();
                }
            } else if (t.ExisteInterseccion(XX, ae)) {

                produccion = t.RetProduccion();

                // mostrar [B]=B+"|"+RetPila()+"|"+RetCad()+"|"+XX+"-->"+produccion;
                mostrarAnalisis = mostrarAnalisis + B + ":  " + RetPila() + "|  " + RetCad() + "|  " + XX + "-->" + produccion + "\n\n";
                B++;

                System.out.println("|" + RetPila() + "|" + RetCad() + "|" + XX + "-->" + produccion);
                i = i - 1; // se descuenta un simbolo de la pila
                // si la produccion es & no se mete en la pila
                if (!produccion.equals("λ")) {
                    Empilar(produccion);
                }
            } else {
                Mensaje = "2";
                error();
                System.out.println("2");
                break;
            }  

        } while (!XX.equals("$"));
        Analisis = mostrarAnalisis;
        Mensaje = "Finalizado con exito";
    }


    //private javax.swing.JTextField Mensaje;
    
    public static void main(String[] args) {
        Parser A = new Parser();
        A.Analizar("visible if");
    }
         
}
