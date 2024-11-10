package persistencia;

import gimnasio.Alumno;
import gimnasio.Profesor;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Database {

    // Variable estática para mantener la conexión única
    private static Connection connection;
    private Component parentComponent;

    private Database() {
    }

    //Metodo que crea la conexion.
    public static Connection connect() {
        if (connection == null) {
            String url = "jdbc:sqlite:gimnasio.db";
            try {
                //Si no existe la conexion, intenta establecerla (recomendacion de gpt)
                connection = DriverManager.getConnection(url);
                System.out.println("Conexión exitosa a la base de datos.");
            } catch (SQLException e) {
                System.out.println("Error de conexión: " + e.getMessage());
            }
        }
        // Devuelve la conexión única
        return connection;
    }

    // Método para cerrar la conexión si es necesario
    public static void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Conexión cerrada.");
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }

    
}
