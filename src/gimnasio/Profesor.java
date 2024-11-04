package gimnasio;

import java.util.ArrayList;
import java.util.Scanner;

public class Profesor extends Persona {

    private static Scanner sc = new Scanner(System.in); // Static para evitar múltiples instancias del Scanner
    protected  String disciplina;
    private static ArrayList<Profesor> profesores = new ArrayList<>(); // Static para que haya una única lista compartida

    // Constructor vacío
    public Profesor() {
    }

    // Constructor con parámetros
    public Profesor(String nombre, int dni, String correo, String disciplina) {
        super(nombre, dni, correo);
        this.disciplina = disciplina;
    }

    // Getter para la especialidad
    public String getDisciplina() {
        return disciplina;
    }

    // Método para mostrar información del profesor
    @Override
    public void mostrarInfo() {
        System.out.println("Profesor: " + getNombre() + " | Especialidad: " + getDisciplina() + " | DNI: " + getDni() + " | Correo: " + getCorreo());
    }

    // Método para agregar profesor a la lista
    public static void agregarProfesor(String nombre, int dni, String correo, String disciplina) {

        // Crear un nuevo profesor y agregarlo a la lista
        Profesor nuevoProfesor = new Profesor(nombre, dni, correo, disciplina);
        profesores.add(nuevoProfesor);

    }

    // Método para mostrar todos los profesores registrados
    public void mostrarProfesores() {
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores registrados.");
        } else {
            System.out.println("Lista de profesores:");
            for (Profesor prof : profesores) {
                prof.mostrarInfo();
            }
        }
    }
}
