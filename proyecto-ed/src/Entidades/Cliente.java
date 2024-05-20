package Entidades;
import Estructuras.ColaMensajes;
import Estructuras.PilaCarritoDelivery;
import Estructuras.PilaCarritoRecojo;
//import javafx.beans.InvalidationListener;
//import javafx.beans.Observable;

public class Cliente {
    String username;
    String password;
    String nombre;
    String apellido;
    String dni;
    String direccion;
    PilaCarritoDelivery carr = new PilaCarritoDelivery();
    PilaCarritoRecojo carr2 = new PilaCarritoRecojo();
    ColaMensajes men = new ColaMensajes();

        
    public String getDni() {
        return dni;
    }

    public PilaCarritoDelivery getCarr() {
        return carr;
    }
    
    public PilaCarritoRecojo getCarr2(){
        return carr2;
    }
    
    public void addToCart(Producto p){
        carr.push(p);
    }
    
    public void addToCart2(Producto p){
        carr2.push(p);
    }
    
    public void addToMessenger(Mensaje m){
        men.encolar(m);
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public ColaMensajes getMen(){
        return men;
    }
    
}
