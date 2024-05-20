/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import general.Conexion;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String query = "DELETE FROM genero WHERE nombre_genero = '" + "a" + "'";

        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el elemento '" + "a" + "'?", "Seleccione una opcion", JOptionPane.YES_NO_OPTION);

        try {
            Conexion co = new Conexion();

                if (confirmacion == JOptionPane.YES_OPTION) {
                    java.sql.Connection cn = co.conectar();
                    Statement stmt = cn.createStatement();
                    stmt.executeUpdate(query);

                    JOptionPane.showMessageDialog(null, "Operacion exitosa", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                }

            //actualizar();

        } catch (SQLException e) {
            System.out.println("Hubo un error en la conexión.");
        }
    }
    
}
