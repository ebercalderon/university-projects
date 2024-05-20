package Estructuras;

import Nodos.NodoMensaje;
import Entidades.Mensaje;

public class ColaMensajes {

    public NodoMensaje frente, ultimo;
    private int longitud;

    public ColaMensajes() {
        frente = ultimo = null;
        longitud = 0;
    }

    //Inserción por el final
    public void encolar(Mensaje msj) {
        NodoMensaje nuevoNodo = new NodoMensaje(msj);
        if (frente == null) {
            frente = ultimo = nuevoNodo;
        } else {
            ultimo.siguiente = nuevoNodo;
            ultimo = nuevoNodo;
        }
        longitud++;
    }

    //Eliminar por el frente
    public Mensaje desencolar() {
        Mensaje msj = null;
        if (!vacio()) {
            msj = frente.mensaje;
            if (frente == ultimo) {
                frente = ultimo = null;
            } else {
                frente = frente.siguiente;
            }
            longitud--;
        }
        return msj;
    }

    public boolean vacio() {
        return frente == null;
    }

    public String[][] getDatos() {
        if (!vacio()) {
            String s[][] = new String[this.longitud][2];
            int i = 0;
            NodoMensaje temp = frente;
            while (temp != null) {
                s[i][0] = temp.mensaje.getEmisor();
                s[i][1] = temp.mensaje.getTextoEmisor();
                i++;
                temp = temp.siguiente;
            }
            return s;
        }
        return null;
    }

    public String[] get_Titulo_Mensaje() {
        String result[] = new String[2];
        result[0] = "Cliente";
        result[1] = "Mensaje";
        return result;
    }

}
