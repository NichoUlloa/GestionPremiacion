package modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pelicula {
    // Atributos
    private ArrayList<Actor> actores;
    private Director director;
    private LocalDate fechaEstreno;
    private String titulo;
    private int duracion;
    private String sinopsis;
    public GestionPremiacion premiacion;
    private CategoriasPeliculas categoria;
    private int puntaje;

    // Constructor
    public Pelicula(LocalDate fechaEstreno, String titulo, int duracion, String sinopsis, CategoriasPeliculas categoria, Director director) {
        this.fechaEstreno = fechaEstreno;
        this.titulo = titulo;
        this.duracion = duracion;
        this.sinopsis = sinopsis;
        this.director = director;
        this.actores = new ArrayList<Actor>();
        this.categoria = categoria;
    }

    // Getters y Setters
    public ArrayList<Actor> getActores() {
        return this.actores;
    }
    public void setActores(ArrayList<Actor> actores) {
        this.actores = actores;
    }

    public LocalDate getFechaEstreno() {
        return this.fechaEstreno;
    }
    public void setFechaEstreno(LocalDate fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public String getTitulo() {
        return this.titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return this.duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getSinopsis() {
        return this.sinopsis;
    }
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public Director getDirector() {
        return this.director;
    }
    public void setDirector(Director director) {
        this.director = director;
    }

    public CategoriasPeliculas getCategoria() {
        return this.categoria;
    }
    public void setCategoria(CategoriasPeliculas categoria) {
        this.categoria = categoria;
    }

    public int getPuntaje() {
        return this.puntaje;
    }
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public GestionPremiacion getPremiacion() {
        return this.premiacion;
    }
    public void setPremiacion(GestionPremiacion premiacion) {
        this.premiacion = premiacion;
    }

    // Metodos
    public void agregarActor(Actor actor) {
        this.actores.add(actor);
    }

    @Override
    public String toString() {
        return "Pelicula: " + titulo + "\n" +
                "Fecha de Estreno: " + fechaEstreno + "\n" +
                "Duracion: " + duracion + " minutos" + "\n" +
                "Sinopsis: " + sinopsis + "\n" +
                "Director: " + director.getNombre() + " " + director.getApellido() + "\n" +
                "Categoria: " + categoria.getCategoria() + "\n" +
                "Puntaje: " + puntaje + "\n";
    }

}
// tipo de override
//   @Override
//    public String toString() {
//        return "Nombre: " + nombre + " " + apellido + "\n" +
//                "RUN: " + run + "\n" +
//                "Edad: " + edad + "\n";
//    }