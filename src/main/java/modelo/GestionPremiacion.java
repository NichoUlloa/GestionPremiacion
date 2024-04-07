package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class GestionPremiacion {
    // Atributos
    private LocalDate fechaPremiacion;
    private ArrayList<Pelicula> peliculas;

    // Constructor
    public GestionPremiacion(LocalDate fechaPremiacion) {
        this.fechaPremiacion = fechaPremiacion;
        this.peliculas = new ArrayList<Pelicula>();
    }

    // Getters y Setters
    public LocalDate getFechaPremiacion() {
        return this.fechaPremiacion;
    }
    public void setFechaPremiacion(LocalDate fechaPremiacion) {
        this.fechaPremiacion = fechaPremiacion;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return this.peliculas;
    }
    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    // Método para asignar un puntaje aleatorio a las películas
    public void asignarPuntajeRandomPeliculas() {
        Random random = new Random();
        for (Pelicula pelicula : this.peliculas) {
            pelicula.setPuntaje(random.nextInt(11)); // Puntaje aleatorio entre 0 y 10
        }
    }

    // Método para seleccionar solo una película ganadora por cada categoría
    public void seleccionarPeliculasGanadoras() {
        for (Pelicula pelicula : this.peliculas) {
            if (pelicula.getPuntaje() > 0) {
                for (Pelicula pelicula2 : this.peliculas) {
                    if (pelicula.getCategoria().equals(pelicula2.getCategoria()) && pelicula.getPuntaje() < pelicula2.getPuntaje()) {
                        pelicula.setPuntaje(0);
                    }
                }
            }
        }
    }

    // Método para informar las películas ganadoras y su categoría
    public void informarPeliculasGanadoras() {
        for (Pelicula pelicula : this.peliculas) {
            if (pelicula.getPuntaje() > 0) {
                System.out.println("Pelicula ganadora en la categoría " + pelicula.getCategoria().getCategoria() + ":");
                System.out.println(pelicula.toString());
            }
        }
    }

    // Método para obtener los actores de una película
    public void obtenerActoresPelicula(Pelicula pelicula) {
        System.out.println("Actores de la película \"" + pelicula.getTitulo() + "\":");
        for (Actor actor : pelicula.getActores()) {
            System.out.println(actor.toString());
        }
    }

    // Método para obtener los actores de una película ganadora usando los metodos seleccionarPeliculasGanadoras y obtenerActoresPelicula
    public void obtenerActoresPeliculaGanadora() {
        seleccionarPeliculasGanadoras();
        for (Pelicula pelicula : this.peliculas) {
            if (pelicula.getPuntaje() > 0) {
                obtenerActoresPelicula(pelicula);
            }
        }
    }

    // Método para listar directores y actores premiados
    public void listarDirectoresActoresPremiados() {
        System.out.println("Directores y actores premiados:");
        for (Pelicula pelicula : this.peliculas) {
            if (pelicula.getPuntaje() > 0) {
                System.out.println("Director:");
                System.out.println(pelicula.getDirector().toString());
                System.out.println("Actores:");
                for (Actor actor : pelicula.getActores()) {
                    System.out.println(actor.toString());
                }
            }
        }
    }
}
