/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Entidades.Empleado;
import Nodos.NodoArbol;

public class ArbolGeneral {

    public NodoArbol raiz;
    private int idEmpleado;
    private int longitud;

    public ArbolGeneral(Empleado e) {
        raiz = new NodoArbol(e);
        idEmpleado = 1;
        longitud = 1;
    }

    public int idEm() {
        return (idEmpleado++);
    }

    public void insertar(Empleado hijo) {
        NodoArbol[] p = new NodoArbol[1];
        Buscar(raiz, p, hijo.getIdCargoJefe());
        if (p[0] != null) {
            NodoArbol x = new NodoArbol(hijo);
            if (p[0].hijo == null) {
                p[0].hijo = x;
            } else {
                p[0] = p[0].hijo;
                //x se insertará como hermano del último hijo insertado en el padre
                while (p[0].hermano != null) {
                    p[0] = p[0].hermano;
                }
                p[0].hermano = x;
            }
            longitud++;
        }
    }

    public void Buscar(NodoArbol padre, NodoArbol[] puntero, int idCargoJefe) {
        if (padre != null) {
            if (padre.empleado.getIdcargo() == idCargoJefe) {
                puntero[0] = padre;
            }
            Buscar(padre.hijo, puntero, idCargoJefe);
            Buscar(padre.hermano, puntero, idCargoJefe);
        }
    }

    public boolean estaVacia() {
        return raiz == null;
    }

    public void preOrden(NodoArbol nodo) {
        if (nodo != null) {
            System.out.println(nodo.empleado.getNombreCargo() + " ");
            NodoArbol tempNodo = nodo.hijo;
            while (tempNodo != null) {
                preOrden(tempNodo);
                tempNodo = tempNodo.hermano;
            }
        }
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public int getLongitud() {
        return longitud;
    }

}
