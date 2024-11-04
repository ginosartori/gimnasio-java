
package gimnasio;

/**
 *
 * @author Sartori
 */
public class Yoga extends Clases {

    public Yoga(String nombre, int duracion, int capMaxima) {
        super("Yoga", 90, 30);
    }

    @Override
    public void hacerEjercicio() {
        System.out.println("Haciendo Yoga...");
    }

}
