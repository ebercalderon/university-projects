package Persistencia;

import Modelo.Clases.Estudiante;
import Modelo.Clases.Matricula;
import Modelo.Clases.Usuario;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gonzalo
 */
public class Datos {

    public static void reiniciarUsuarios() {

        ArrayList<Usuario> usuario = new ArrayList<Usuario>();

        try {
            ObjectOutputStream salida = new ObjectOutputStream(
                    new FileOutputStream(
                            "src/Archivos/usuarios.dat"));

            salida.close();
            //JOptionPane.showMessageDialog(null, "Registro reiniciado");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error de E/S de archivo Usuarios");
        }
        
        usuario.add(new Usuario("admin", "admin", "Administrador", "123", "admin", "admin", " ", "0000", "Masculino"));
        agregarUsuario(usuario);

    }

    public static ArrayList<Usuario> cargarUsuarios() {

        //ArrayList<Usuario> usuario = null;
        ArrayList<Usuario> usuario = new ArrayList<Usuario>();

        try {
            ObjectInputStream entrada = new ObjectInputStream(
                    new FileInputStream(
                            "src/Archivos/usuarios.dat"));

            usuario = (ArrayList<Usuario>) entrada.readObject();
            entrada.close();

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Clase no encontrada Usuarios");
        } catch (IOException e) {
        }

        return usuario;

    }

    public static void agregarUsuario(ArrayList<Usuario> lista) {

        try {
            ObjectOutputStream salida = new ObjectOutputStream(
                    new FileOutputStream(
                            "src/Archivos/usuarios.dat"));

            salida.writeObject(lista);
            salida.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de E/S de archivo Usuarios");
        }

    }

    /* ------------------------------------------------------------------------------------------ */
    public static void reiniciarEstudiantes() {

        ArrayList<Estudiante> estudiante = new ArrayList<Estudiante>();

        try {
            ObjectOutputStream salida = new ObjectOutputStream(
                    new FileOutputStream(
                            "src/Archivos/estudiantes.dat"));

            salida.close();
            //JOptionPane.showMessageDialog(null, "Registro reiniciado");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error de E/S de archivo Estudiantes");
        }

        estudiante.add(new Estudiante("Universidad", "Ingeniería de Sistemas", "test@gmail.com", "2021", "No matriculado", 0, "12345", "Test", "Test", "16-10-1999", "12345", "Masculino"));
        agregarEstudiante(estudiante);

    }

    public static ArrayList<Estudiante> cargarEstudiantes() {

        ArrayList<Estudiante> estudiante = new ArrayList<Estudiante>();

        try {
            ObjectInputStream entrada = new ObjectInputStream(
                    new FileInputStream(
                            "src/Archivos/estudiantes.dat"));

            estudiante = (ArrayList<Estudiante>) entrada.readObject();
            entrada.close();

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Clase no encontrada Estudiantes");
        } catch (IOException e) {
        }

        return estudiante;

    }

    public static void agregarEstudiante(ArrayList<Estudiante> lista) {

        try {
            ObjectOutputStream salida = new ObjectOutputStream(
                    new FileOutputStream(
                            "src/Archivos/estudiantes.dat"));

            salida.writeObject(lista);
            salida.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de E/S de archivo Estudiantes");
        }

    }
    
   /* ------------------------------------------------------------------------------------------ */
    public static void reiniciarMatriculas() {

        ArrayList<Matricula> matricula = new ArrayList<Matricula>();

        try {
            ObjectOutputStream salida = new ObjectOutputStream(
                    new FileOutputStream(
                            "src/Archivos/matriculas.dat"));

            salida.close();
            //JOptionPane.showMessageDialog(null, "Registro reiniciado");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error de E/S de archivo Matriculas");
        }

        //matricula.add(new Matricula(" ", " ", " ", " ", null, 0));
        agregarMatricula(matricula);

    }

    public static ArrayList<Matricula> cargarMatriculas() {

        ArrayList<Matricula> matricula = new ArrayList<Matricula>();

        try {
            ObjectInputStream entrada = new ObjectInputStream(
                    new FileInputStream(
                            "src/Archivos/matriculas.dat"));

            matricula = (ArrayList<Matricula>) entrada.readObject();
            entrada.close();

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Clase no encontrada Matricula");
        } catch (IOException e) {
        }

        return matricula;

    }

    public static void agregarMatricula(ArrayList<Matricula> lista) {

        try {
            ObjectOutputStream salida = new ObjectOutputStream(
                    new FileOutputStream(
                            "src/Archivos/matriculas.dat"));

            salida.writeObject(lista);
            salida.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de E/S de archivo Matricula");
        }

    }

}
