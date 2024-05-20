package ConexionSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL {

    Connection cn;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mediterraneo?zeroDateTimeBehavior=CONVERT_TO_NULL&useSSL=false&Timezone=true&serverTimezone=UTC ", "root", "eacc");
            System.out.println("Se hizo la conexión con la Base de Datos exitosamente");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Eror al conectar");
        }
        return cn;
    }

}
