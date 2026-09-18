package dos.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionDB {
private static Connection connection;
    
    public static Connection getConexion() {
        if (connection == null) {
            try {
                String url = "jdbc:sqlite:agroalimentaria.db";
                connection = DriverManager.getConnection(url, "user", "pass");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
