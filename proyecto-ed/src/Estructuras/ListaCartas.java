package Estructuras;

import Entidades.Producto;
import Nodos.NodoCarta;

public class ListaCartas {

    public NodoCarta cabeza;
    private int idBebida;
    private int longitud;

    public ListaCartas() {
        this.cabeza = cabeza;
        this.idBebida = idBebida;
        this.longitud = longitud;
    }

    public void insertar(Producto producto) {
        NodoCarta nodo = new NodoCarta(producto);
        nodo.siguiente = cabeza;
        cabeza = nodo;
        longitud++;
    }

    public Producto obtener(int n) {
        if (cabeza == null) {
            return null;
        } else {
            NodoCarta puntero = cabeza;
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

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void mostrarElementos() {
        NodoCarta tempNodo = cabeza;
        while (tempNodo != null) {
            System.out.println(tempNodo.producto.toString());
            tempNodo = tempNodo.siguiente;
        }
    }

    public Producto buscarCarta(String nombre) {
        System.out.println(nombre);
        NodoCarta temp = cabeza;
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

    public String[] get_Titulo_Cartas() {
        String result[] = new String[3];
        result[0] = "Producto";
        result[1] = "Descripcion";
        result[2] = "Precio";
        return result;
    }

    //Muestra a todas las cartas sin ninguna restricción
    public String[][] getDatos() {
        if (cabeza != null) {
            String s[][] = new String[this.longitud][3];
            int i = 0;
            NodoCarta temp = cabeza;
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

    public boolean eliminarCarta(Producto producto) {
        if (!estaVacia()) {
            NodoCarta auxBorrar = cabeza;
            NodoCarta auxAnterior = null;
            while ((auxBorrar != null) && (auxBorrar.producto != producto)) {
                auxAnterior = auxBorrar;
                auxBorrar = auxBorrar.siguiente;
            }
            if (auxBorrar == null) {
                //El elemento no ha sido encontrado
                return false;
            } else if (auxAnterior == null) {
                //Se debe eliminar el primer nodo
                cabeza = cabeza.siguiente;
                return true;
            } else {
                //El elemento está en la lista, pero no es el primero
                auxAnterior.siguiente = auxBorrar.siguiente;
                return true;
            }
        }
        return false;
    }

    public int getLongitud() {
        return longitud;
    }
}
