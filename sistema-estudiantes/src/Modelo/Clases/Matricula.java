package Modelo.Clases;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Gonzalo
 */
public class Matricula implements Serializable{

    private String IDmatricula;
    private String IDestudiante;
    private String semestre;
    private String salon;
    private ArrayList<Curso> cursos;
    private int nroCursos;

    //Método Constructor por Defecto
    public Matricula() {
        this.IDmatricula = " ";
        this.IDestudiante = " ";
        this.semestre = " ";
        this.salon = " ";
        this.cursos = null;   
        this.nroCursos = 0;
    }

    public Matricula(String IDmatricula, String IDestudiante, String semestre, String salon, ArrayList<Curso> cursos, int nroCursos) {
        this.IDmatricula = IDmatricula;
        this.IDestudiante = IDestudiante;
        this.semestre = semestre;
        this.salon = salon;
        this.cursos = cursos;
        this.nroCursos = nroCursos;
    }


    //Métodos de tipo SET y GET

    public String getIDmatricula() {
        return IDmatricula;
    }

    public void setIDmatricula(String IDmatricula) {
        this.IDmatricula = IDmatricula;
    }

    public String getIDestudiante() {
        return IDestudiante;
    }

    public void setIDestudiante(String IDestudiante) {
        this.IDestudiante = IDestudiante;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public int getNroCursos() {
        return nroCursos;
    }

    public void setNroCursos(int nroCursos) {
        this.nroCursos = nroCursos;
    }
   
}
