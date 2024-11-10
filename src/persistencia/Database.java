package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    // Variable estática para mantener la conexión única
    private static Connection connection;

    private Database() {
    }

    // Método que crea o reutiliza la conexión
    public static Connection connect() {
        try {
            // Verifica si la conexión es nula o está cerrada antes de reutilizarla
            if (connection == null || connection.isClosed()) {
                String url = "jdbc:sqlite:gimnasio.db"; // Ruta de la base de datos
                connection = DriverManager.getConnection(url);
                System.out.println("Conexión exitosa a la base de datos.");
            }
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
        return connection;
    }

    // Método para cerrar la conexión
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
