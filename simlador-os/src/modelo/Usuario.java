
package modelo;

import java.io.Serializable;


public class Usuario implements Serializable{
    private String user_nombre;
    private String user_clave;
    private String user_permisos;
    

    public String getNombre() {
        return user_nombre;
    }

    public void setNombre(String user_nombre) {
        this.user_nombre = user_nombre;
    }

    public String getClave() {
        return user_clave;
    }

    public void setClave(String user_clave) {
        this.user_clave = user_clave;
    }

    public String getPermisos() {
        return user_permisos;
    }

    public void setPermisos(String user_permisos) {
        this.user_permisos = user_permisos;
    }

    @Override
    public String toString() {
        return  user_nombre;
    }
    
}
