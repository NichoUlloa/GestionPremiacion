package modelo;

public class Jurado {
    // Atributos
    private GestionPremiacion premiacion;
    private String nombre;
    private String apellido;
    private String nacionalidad;

    // Constructor
    public Jurado(String nombre, String apellido, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
    }

    // Getters y Setters
    public GestionPremiacion getPremiacion() {
        return this.premiacion;
    }
    public void setPremiacion(GestionPremiacion gestionPremiacion) {
        this.premiacion = gestionPremiacion;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return this.nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Nombre: " + nombre + " " + apellido + "\n" +
                "Nacionalidad: " + nacionalidad + "\n";
    }
}
