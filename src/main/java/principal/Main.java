package principal;

import modelo.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        inicializar();
    }
    public static void inicializar() {
        GestionPremiacion premiacion = new GestionPremiacion(LocalDate.of(2021, 10, 10));

        Actor actor1 = new Actor("Robert", "Downey Jr", "Estadounidense");
        Actor actor2 = new Actor("Chris", "Evans", "Estadounidense");
        Actor actor3 = new Actor("Mark", "Ruffalo", "Estadounidense");
        Director director1 = new Director("Joss", "Whedon", "Estadounidense");
        Pelicula pelicula1 = new Pelicula(LocalDate.of(2012, 4, 11), "The Avengers", 143, "Sinopsis de The Avengers", CategoriasPeliculas.ACCION, director1);

        Actor actor4 = new Actor("Chris", "Evans", "Estadounidense");
        Actor actor5 = new Actor("Scarlett", "Johansson", "Estadounidense");
        Actor actor6 = new Actor("Sebastian", "Stan", "Estadounidense");
        Director director2 = new Director("Anthony", "Russo", "Estadounidense");
        Pelicula pelicula2 = new Pelicula(LocalDate.of(2014, 4, 4), "Captain America: The Winter Soldier", 136, "Sinopsis de Captain America: The Winter Soldier", CategoriasPeliculas.ACCION, director2);

        // agregar actores a la pelicula 1
        pelicula1.getActores().add(actor1);
        pelicula1.getActores().add(actor2);
        pelicula1.getActores().add(actor3);

        // agregar actores a la pelicula 2
        pelicula2.getActores().add(actor4);
        pelicula2.getActores().add(actor5);
        pelicula2.getActores().add(actor6);

        premiacion.getPeliculas().add(pelicula1);
        premiacion.getPeliculas().add(pelicula2);
        premiacion.asignarPuntajeRandomPeliculas();

        // uso metodo seleccionarPeliculaGanadoraCategoria
        System.out.println("*** Películas ganadoras en la premiación y su respectiva categoría ***");
        premiacion.seleccionarPeliculasGanadoras();
        // uso metodo informarPeliculasGanadoras
        premiacion.informarPeliculasGanadoras();

        // uso metodo obtenerActoresPelicula
        System.out.println("*** Actores que participan en las películas ***");
        premiacion.obtenerActoresPelicula(pelicula1);

        // uso metodo obtenerActoresPeliculaGanadora
        System.out.println("*** Actores que participan en la película ganadora ***");
        premiacion.obtenerActoresPeliculaGanadora();

        // uso metodo listarDirectoresActoresPremiados
        System.out.println("*** Directores y actores premiados ***");
        premiacion.listarDirectoresActoresPremiados();
    }
}
