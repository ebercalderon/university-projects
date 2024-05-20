package Modelo.Clases;

import java.io.Serializable;

/**
 *
 * @author Gonzalo
 */
public class Curso implements Serializable{

    private String nombreCurso;
    private float nota;

    //Método Constructor por Defecto
    public Curso() {
        this.nombreCurso = " ";  
        this.nota = 0;
    }
    
    public Curso(String nombreCurso, float nota) {
        this.nombreCurso = nombreCurso;
        this.nota = nota;
    }

    //Métodos de tipo SET y GET

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    
}
