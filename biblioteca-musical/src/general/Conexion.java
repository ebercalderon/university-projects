package general;

import java.sql.*;

public class Conexion {
    // Método para conectarse a la base de datos local llamado 'biblioteca_musical', nombre de usuario 'root' y contraseña en blanco
    public Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca_musical", "root", "eacc");
            return (c);
        } catch (ClassNotFoundException e) {
            System.out.println("¡Problema de configuración del controlador MySQL!");
        } catch (SQLException e) {
            System.out.println("¡Problema al conectarse a la base de datos!");
        }
        return (null);
    }
}
