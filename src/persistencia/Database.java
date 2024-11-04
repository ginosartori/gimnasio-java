package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    // Método para establecer la conexión
    public static Connection connect() {
        
        String url = "jdbc:sqlite:gimnasio.db"; 
 
        Connection conn = null;

        try {
            // Intenta establecer la conexión
            conn = DriverManager.getConnection(url);
            System.out.println("Conexion exitosa a la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }

        return conn;
    }
}
