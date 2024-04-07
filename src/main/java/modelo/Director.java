package modelo;

import java.util.ArrayList;

public class Director extends Participante{
    // Atributos
    private GestionPremiacion premiacion;
    private ArrayList<Pelicula> peliculas;

    // Constructor
    public Director(String nombre, String apellido, String nacionalidad) {
        super(nombre, apellido, nacionalidad);
        this.peliculas = new ArrayList<Pelicula>();
    }

    // Getters y Setters
    public GestionPremiacion getPremiacion() {
        return this.premiacion;
    }
    public void setPremiacion(GestionPremiacion gestionPremiacion) {
        this.premiacion = gestionPremiacion;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return this.peliculas;
    }
    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    // metodo getTipo
    public String getTipo() {
        return "Director";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
