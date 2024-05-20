/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodos;

import Entidades.Producto;

public class NodoBebida {

    public Producto producto;
    public NodoBebida siguiente;

    public NodoBebida(Producto producto) {
        this.producto = producto;
        this.siguiente = null;
    }
}
