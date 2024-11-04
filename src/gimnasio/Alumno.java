package gimnasio;

import java.util.ArrayList;
import java.util.Scanner;

public class Alumno extends Persona {

    private static int contadorId = 0;  // Static para que sea compartido entre todas las instancias
    private int alumnoID;
    private static ArrayList<Alumno> alumnos = new ArrayList<>();  
    private static Scanner sc = new Scanner(System.in);  //Static por recomendación de gpt para evitar varias instancias de un mismo scanner.

    
    public Alumno() {
    }

    
    public Alumno(String nombre, int dni, String correo) {
        super(nombre, dni, correo);
        this.alumnoID = ++contadorId;  //El id se deberia generar automaticamente.
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Alumno: " + getNombre() + " | DNI: " + getDni() + " | ID: " + getAlumnoID() + " | Correo: " + getCorreo());
    }

    // Getter para el ID del alumno
    public int getAlumnoID() {
        return alumnoID;
    }

    // Método para inscribir un alumno
    public static void inscribirAlumno(String nombre, int dni, String correo) {
        
        Alumno nuevoAlumno = new Alumno(nombre, dni, correo);
        alumnos.add(nuevoAlumno);

        System.out.println("Alumno inscripto con éxito. ID asignado: " + nuevoAlumno.getAlumnoID());
    }

    // Método para mostrar los alumnos inscriptos
    public void alumnosInscriptos() {
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos inscriptos.");
        } else {
            System.out.println("Lista de alumnos inscriptos:");
            for (Alumno alumn : alumnos) {
                alumn.mostrarInfo();
            }
        }
    }
    
    //Método para asignarle a un alumno un tipo de entrenamiento o tipos de entrenamientos.
    }

