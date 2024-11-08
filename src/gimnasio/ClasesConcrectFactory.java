/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gimnasio;

/**
 *
 * @author usuario
 */
public class ClasesConcrectFactory implements ClasesAbstractFactory {

    @Override
    public Clases getClases(Profesor profesor) {
        String disciplina = profesor.getDisciplina();
        switch (disciplina) {

            case "Yoga":
                return new Yoga("Yoga", 90, 30);

            case "Musculación":
                return new Musculacion("Musculación", 00, 60);

            default:
                throw new IllegalArgumentException("Disciplina no válida" + disciplina);
        }

    }

}
