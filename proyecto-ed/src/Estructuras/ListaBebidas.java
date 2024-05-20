package Estructuras;

import Entidades.Producto;
import Nodos.NodoBebida;

public class ListaBebidas {

    public NodoBebida cabeza;
    private int idBebida;
    private int longitud;

    public ListaBebidas() {
        this.cabeza = null;
        this.idBebida = 0;
        this.longitud = 0;
    }

    public void insertar(Producto producto) {
        NodoBebida nodo = new NodoBebida(producto);
        if (cabeza == null) {
            // System.out.println("CABN");
            cabeza = nodo;
        } else {
            //System.out.println("CAB");
            nodo.siguiente = cabeza;
            cabeza = nodo;
        }
        longitud++;

    }

    public Producto obtener(int n) {
        if (cabeza == null) {
            return null;
        } else {
            NodoBebida puntero = cabeza;
            int contador = 0;
            while (contador < n && puntero.siguiente != null) {
                puntero = puntero.siguiente;
                contador++;
            }
            if (contador != n) { //Si el while se ha detenido por la 2da condición
                return null;
            } else {
                return puntero.producto;
            }
        }
    }

    /* public boolean estaVacia() {
        return cabeza == null;
    }*/
    public void mostrarElementos() {
        NodoBebida tempNodo = cabeza;
        while (tempNodo != null) {
            System.out.println(tempNodo.producto.toString());
            tempNodo = tempNodo.siguiente;
        }
    }

    public Producto buscarBebida(String nombre) {
        System.out.println(nombre);
        NodoBebida temp = cabeza;
        System.out.println(temp);
        if (temp == null) {
            return null;
        } else {
            while (temp != null) {
                System.out.println(temp.producto.getNombre().equals(nombre));
                if (temp.producto.getNombre().equals(nombre)) {
                    return temp.producto;
                }
                temp = temp.siguiente;
            }
            return null;
        }
    }

    public String[] get_Titulo_Bebidas() {
        String result[] = new String[3];
        result[0] = "Producto";
        result[1] = "Descripcion";
        result[2] = "Precio";
        return result;
    }

    //Muestra a todas las bebidas sin ninguna restricción
    public String[][] getDatos() {
        if (cabeza != null) {
            String s[][] = new String[this.longitud][3];
            int i = 0;
            NodoBebida temp = cabeza;
            while (temp != null) {
                s[i][0] = temp.producto.getNombre();
                s[i][1] = temp.producto.getDescripcion();
                s[i][2] = String.valueOf(temp.producto.getPrecio());
                i++;
                temp = temp.siguiente;
            }
            return s;
        }
        return null;
    }

    public int getLongitud() {
        return longitud;
    }
}
