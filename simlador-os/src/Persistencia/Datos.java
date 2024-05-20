package Persistencia;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Usuario;

public class Datos {
    
    public static void reiniciarUsuarios() {
        
        ArrayList<Usuario> usuario = new ArrayList<Usuario>();

        try {
            ObjectOutputStream salida = new ObjectOutputStream(
                    new FileOutputStream(
                            "src/Persistencia/usuarios.dat"));

            salida.close();
            JOptionPane.showMessageDialog(null, "Registro reiniciado");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error de E/S de archivo");
        }
                
    }
    
    public  static ArrayList<Usuario> cargarUsuarios() {
        
        ArrayList<Usuario> usuario = new ArrayList<Usuario>(); // null

        try {
            ObjectInputStream entrada = new ObjectInputStream(
                    new FileInputStream(
                            "src/Persistencia/usuarios.dat"));

            usuario = (ArrayList<Usuario>) entrada.readObject();
            entrada.close();

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Clase no encontrada");
        } catch (IOException e) {
        }
        
        return usuario;

    }
    
    public static void agregarUsuario(ArrayList<Usuario> lista) {  

        try {
            ObjectOutputStream salida = new ObjectOutputStream(
                    new FileOutputStream(
                            "src/Persistencia/usuarios.dat"));

            salida.writeObject(lista);
            salida.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de E/S de archivo");
        }
        
    }
    /*
    public static void main(String[] args) {
        ArrayList<Usuario> usuario = new ArrayList<Usuario>();

        try {
            ObjectOutputStream salida = new ObjectOutputStream(
                    new FileOutputStream(
                            "src/Persistencia/usuarios.dat"));

            salida.close();
            JOptionPane.showMessageDialog(null, "Registro reiniciado");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error de E/S de archivo");
        }
    }
*/
        
}
