/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodos;

import Entidades.Mensaje;

public class NodoMensaje {

    public Mensaje mensaje;
    public NodoMensaje siguiente;

    public NodoMensaje(Mensaje mensaje) {
        this.mensaje = mensaje;
        this.siguiente = null;
    }
}
