package gimnasio;

import igu.pantalla;
import persistencia.Database;
import java.sql.Connection;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Gimnasio {
    public static void main(String[] args) {
        // Crear la ventana
        pantalla pantalla = new pantalla();
        
        // Agregar un listener para cerrar la conexión al cerrar la ventana
        pantalla.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Database.closeConnection();  // Cerrar la conexión a la base de datos
                System.out.println("Conexión cerrada.");
                System.exit(0);  // Salir del programa
            }
        });
        
        // Hacer visible la pantalla
        pantalla.setVisible(true);
        
        // Conexión a la base de datos (se mantiene abierta mientras dure la aplicación)
        Connection conn = Database.connect();
        
        // Realizar operaciones con la base de datos aquí
        // ...
    }
}
