package Modelo.Clases;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class Persona implements Serializable {

    protected String dni;
    protected String nombre;
    protected String apellido;
    protected String nacimiento;
    protected String celular;
    protected String genero;
    
    //Método Constructor por Defecto
    public Persona(String dni, String nombre, String apellido, String nacimiento, String celular, String genero) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.celular = celular;
        this.genero = genero;
    }
    
    public Persona() {
        this.dni = " ";
        this.nombre = " ";
        this.apellido = " ";
        this.nacimiento = " ";
        this.celular = " ";
        this.genero = " ";
    }

    //Métodos de tipo SET y GET

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


}
