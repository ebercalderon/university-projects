/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodos;

import Entidades.Producto;

public class NodoEntrada {

    public Producto producto;
    public NodoEntrada siguiente;

    public NodoEntrada(Producto producto) {
        this.producto = producto;
        this.siguiente = null;
    }
}
