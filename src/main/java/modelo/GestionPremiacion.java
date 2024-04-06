package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;

public class GestionPremiacion {
    // Atributos
    private LocalDate fechaPremiacion;
    private ArrayList<Jurado> jurados;
    private ArrayList<Director> directores;
    private ArrayList<Pelicula> peliculas;

    // Constructor
    public GestionPremiacion(LocalDate fechaPremiacion) {
        this.fechaPremiacion = fechaPremiacion;
        this.jurados = new ArrayList<Jurado>();
        this.directores = new ArrayList<Director>();
        this.peliculas = new ArrayList<Pelicula>();
    }

    // Getters y Setters
    public LocalDate getFechaPremiacion() {
        return this.fechaPremiacion;
    }
    public void setFechaPremiacion(LocalDate fechaPremiacion) {
        this.fechaPremiacion = fechaPremiacion;
    }

    public ArrayList<Jurado> getJurados() {
        return this.jurados;
    }
    public void setJurados(ArrayList<Jurado> jurados) {
        this.jurados = jurados;
    }

    public ArrayList<Director> getDirectores() {
        return this.directores;
    }
    public void setDirectores(ArrayList<Director> directores) {
        this.directores = directores;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return this.peliculas;
    }
    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    // Metodos

    //Seleccionar Ganadores: Este método se encargará de seleccionar a los ganadores de cada categoría y enviarles el aviso correspondiente.
   // metodo seleccionarPeliculaGanadoraCategoria usando metodo asignarPuntajeRandomPeliculas
    public void seleccionarPeliculaGanadoraCategoria(CategoriasPeliculas categoria) {
        asignarPuntajeRandomPeliculas();
        Pelicula peliculaGanadora = null;
        int puntajeMaximo = 0;
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getCategoria() == categoria && pelicula.getPuntaje() > puntajeMaximo) {
                puntajeMaximo = pelicula.getPuntaje();
                peliculaGanadora = pelicula;
            }
        }
        if (peliculaGanadora != null) {
            System.out.println("La pelicula ganadora en la categoria " + categoria + " es: " + peliculaGanadora.getTitulo());
            peliculaGanadora.getDirector().setGanador(true);
            for (Actor actor : peliculaGanadora.getActores()) {
                actor.setGanador(true);
            }
            for (Director director : directores) {
                if (director == peliculaGanadora.getDirector()) {
                    director.setGanador(true);
                }
            }
        }
    }

    // **** Metodo asignar puntaje random a peliculas
    public void asignarPuntajeRandomPeliculas() {
        for (Pelicula pelicula : peliculas) {
            pelicula.setPuntaje((int) (Math.random() * 10) + 1);
        }
    }

    // Informar Películas Ganadoras: Este método mostrará las películas ganadoras en la premiación y su respectiva categoría
    public void informarPeliculasGanadoras() {
        for (CategoriasPeliculas categoria : CategoriasPeliculas.values()) {
            seleccionarPeliculaGanadoraCategoria(categoria);
        }
    }

    // Obtener Actores de una Película: Este método mostrará todos los actores que participan en una película específica.
    public void obtenerActoresPelicula(Pelicula pelicula) {
        System.out.println("Actores de la pelicula " + pelicula.getTitulo() + ":");
        for (Actor actor : pelicula.getActores()) {
            System.out.println(actor.getNombre() + " " + actor.getApellido());
        }
    }

    // Listar Directores y Actores Premiados: Este método mostrará una lista de directores y actores que son parte de la premiación, es decir, aquellos que recibieron un aviso de premio.
    public void listarDirectoresActoresPremiados() {
        System.out.println("Directores premiados:");
        for (Director director : directores) {
            if (director.isGanador()) {
                System.out.println(director.getNombre() + " " + director.getApellido());
            }
        }
        System.out.println("Actores premiados:");
        for (Pelicula pelicula : peliculas) {
            for (Actor actor : pelicula.getActores()) {
                if (actor.isGanador()) {
                    System.out.println(actor.getNombre() + " " + actor.getApellido());
                }
            }
        }
    }



}
