 

package gimnasio;
import igu.pantalla;
import persistencia.Database;
import java.sql.Connection;

public class Gimnasio {
    public static void main(String[] args) {
        pantalla pantalla = new pantalla();
        pantalla.setVisible(true);
        Connection conn = Database.connect();
         
        
        
         
    }
    
}
