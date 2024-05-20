package Modelo.Clases;

/**
 *
 * @author Gonzalo
 */
public class Estudiante extends Persona {

    private String centro;
    private String facultad;
    private String correo;
    private String ingreso;
    private String situacion;
    private float promedio;

    //Método Constructor por Defecto
    public Estudiante() {
        super();
        this.centro = " ";
        this.facultad = " ";
        this.correo = " ";
        this.ingreso = " ";
        this.situacion = " ";   
        this.promedio = 0;
    }
    
    public Estudiante(String centro, String facultad, String correo, String ingreso, String situacion, float promedio, String dni, String nombre, String apellido, String nacimiento, String celular, String genero) {
        super(dni, nombre, apellido, nacimiento, celular, genero);
        this.centro = centro;
        this.facultad = facultad;
        this.correo = correo;
        this.ingreso = ingreso;
        this.situacion = situacion;
        this.promedio = promedio;
    }

    //Métodos de tipo SET y GET
    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getIngreso() {
        return ingreso;
    }

    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }

    public String getSituacion() {
        return situacion;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }



}
