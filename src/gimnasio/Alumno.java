package gimnasio;

import java.util.ArrayList;
import java.util.Scanner;

public class Alumno extends Persona {

    protected String plan;
    private int alumnoID;
    public static ArrayList<Alumno> alumnos = new ArrayList<>();

    public static ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }
    private static Scanner sc = new Scanner(System.in);  //Static por recomendación de gpt para evitar varias instancias de un mismo scanner.

    public Alumno() {
    }

    public Alumno(String nombre, int dni, String correo, String plan) {
        super(nombre, dni, correo);
        this.plan = plan;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Alumno: " + getNombre() + " | DNI: " + getDni() + " | Correo: " + getCorreo());
    }

    // Getter para el ID del alumno
    // Método para inscribir un alumno
    public static void inscribirAlumno(String nombre, int dni, String correo, String plan) {

        Alumno nuevoAlumno = new Alumno(nombre, dni, correo, plan);
        alumnos.add(nuevoAlumno);

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
<<<<<<< HEAD
    /**
     * @return the contadorId
     *
     *
     * /**
     *
     */
    public int getAlumnoID() {
        return alumnoID;
=======
>>>>>>> 25922ec068c36a4e20351f227951dd86027e860e
    }

    /**
     * @param alumnoID the alumnoID to set
     */
    public void setAlumnoID(int alumnoID) {
        this.alumnoID = alumnoID;
    }

    /**
     * @param aAlumnos the alumnos to set
     */
    public static void setAlumnos(ArrayList<Alumno> aAlumnos) {
        alumnos = aAlumnos;
    }

    /**
     * @return the sc
     */
    public static Scanner getSc() {
        return sc;
    }

    /**
     * @param aSc the sc to set
     */
    public static void setSc(Scanner aSc) {
        sc = aSc;
    }

    /**
     * @return the plan
     */
    public String getPlan() {
        return plan;
    }

    /**
     * @param plan the plan to set
     */
    public void setPlan(String plan) {
        this.plan = plan;
    }

}
