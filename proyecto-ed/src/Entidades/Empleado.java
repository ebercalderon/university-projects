
package Entidades;

import java.io.Serializable;

public class Empleado implements Serializable{
    String username;
    String password;
    String nombre;
    String apellido;
    String dni;
    int idcargo;
    int nivel;
    String nombreCargo;
    int idCargoJefe;

    public Empleado(String username, String password, String nombre, String apellido, String dni, int idcargo, int nivel, String nombreCargo, int idCargoJefe) {
        this.username = username;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.idcargo = idcargo;
        this.nivel = nivel;
        this.nombreCargo = nombreCargo;
        this.idCargoJefe = idCargoJefe;
    }

    public Empleado(String username, String password, String nombre, String apellido, String dni, int idcargo, String nombreCargo) {
        this.username = username;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nombreCargo = nombreCargo;
    }
 
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public int getIdcargo() {
        return idcargo;
    }

    public int getNivel() {
        return nivel;
    }

    public String getNombreCargo() {
        return nombreCargo;
    }

    public int getIdCargoJefe() {
        return idCargoJefe;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setIdcargo(int idcargo) {
        this.idcargo = idcargo;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    public void setIdCargoJefe(int idCargoJefe) {
        this.idCargoJefe = idCargoJefe;
    }
    
    public boolean ingresar(String usu, String pass) {
        if (this.getUsername().equalsIgnoreCase(usu)
                && this.password.equals(pass)) {
            return true;
        }
        return false;
    }
    
}
