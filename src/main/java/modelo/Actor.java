package modelo;

import java.util.ArrayList;

public class Actor extends Participante{
    // Atributos
    private ArrayList<Pelicula> peliculas;

    // Constructor
    public Actor(String nombre, String apellido, String nacionalidad) {
        super(nombre, apellido, nacionalidad);
        this.peliculas = new ArrayList<Pelicula>();
    }

    // Getters y Setters
    public ArrayList<Pelicula> getPeliculas() {
        return this.peliculas;
    }
    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    // metodo getTipo
    public String getTipo() {
        return "Actor";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
