package Estructuras;

import Entidades.Producto;

public class  PilaCarritoRecojo {
    class NodoCar2 {
        Producto V;
        NodoCar2 sig;

        public NodoCar2(Producto o) {
            V = o;
            sig = null;
            
        }
    }

    NodoCar2 tope;
    int tamaño;
 
    public PilaCarritoRecojo() {
        tope = null;
        tamaño = 0;
    }

    public void push(Producto o) {
        NodoCar2 Q = new NodoCar2(o);
        if (tope == null) {
            tope = Q;
        } else {
            Q.sig = tope;
            tope = Q;
        }
        tamaño++;
    }

    public Producto pop() {
        if (tope == null) {
            return null;
        } else {
            Producto o = tope.V;
            tope = tope.sig;
            tamaño--;
            return o;
        }
    }

    public boolean Vacio() {
        return (tamaño == 0);
    }

    public int tamaño() {
        return tamaño;
    }

    public Producto Tope() {
        if (tope == null) {
            return null;
        } else {
            return tope.V;
        }
    }
    
    public String[] get_Titulo_Carrito2(){
        String result[] = new String[3];
        result[0] = "Producto";
        result[1] = "Descripcion";
        result[2] = "Precio";
        return result;
    }
    
    public String[][] getDatos2() {
        if (tope != null) {
            String s[][] = new String[this.tamaño][3];
            int i = 0;
            NodoCar2 temp = tope;
            while (temp != null) {
                s[i][0] = temp.V.getNombre();
                s[i][1] = temp.V.getDescripcion();
                s[i][2] = String.valueOf(temp.V.getPrecio());
                i++;
                temp = temp.sig;
            }
            return s;
        }
        return null;
    }
    
    public int getTamaño() {
        return tamaño;
    }
     
     
}
