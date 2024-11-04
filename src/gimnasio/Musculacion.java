/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gimnasio;

/**
 *
 * @author Sartori
 */
public class Musculacion extends Clases {

    public Musculacion(String nombre, int duracion, int capMaxima) {
        super("Musculación", 00, 60);
    }

    @Override
    public void hacerEjercicio() {
        System.out.println("Entrenando...");
    }

}
