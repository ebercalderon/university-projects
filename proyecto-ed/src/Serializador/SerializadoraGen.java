/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializador;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import Estructuras.*;

public class SerializadoraGen {

    public static void serializarBebidas(String nombreArchivo, ListaBebidas tempBebidas) {
        try {
            FileOutputStream file = new FileOutputStream(nombreArchivo);
            ObjectOutputStream escritor = new ObjectOutputStream(file);
            escritor.writeObject(tempBebidas);
            escritor.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ListaBebidas deserializarBebidas(String nombreArchivo) {
        ListaBebidas retorno = new ListaBebidas();
        try {
            FileInputStream file = new FileInputStream(nombreArchivo);
            ObjectInputStream lector = new ObjectInputStream(file);
            retorno = (ListaBebidas) lector.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return retorno;
    }
}
