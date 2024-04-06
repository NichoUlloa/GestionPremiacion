package modelo;

public abstract class Participante {
    protected boolean ganador;
    // Atributos
    private String nombre, apellido, nacionalidad;

    // Constructor
    public Participante(String nombre, String apellido, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
    }

    // Getters y Setters
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

    // Metodos
    // metodo getTipo
    public abstract String getTipo();

    @Override
    public String toString() {
        return "Nombre: " + nombre + " " + apellido + "\n" +
                "Nacionalidad: " + nacionalidad + "\n";
    }

    public void setGanador(boolean b) {
    }

    public boolean isGanador() {
        return false;
    }


}
