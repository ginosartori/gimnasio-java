
package gimnasio;

public abstract class Clases {

    private String nombre;
    private int duracion; //minutos.    
    private int capMaxima; //cupo

    public Clases(String nombre, int duracion, int capMaxima) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.capMaxima = capMaxima;
    }

    //Método abstracto que van a usar las subclases de entrenamiento.
    public abstract void hacerEjercicio();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCapMaxima() {
        return capMaxima;
    }

    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }

}
