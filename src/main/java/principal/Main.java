package principal;

import modelo.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        inicializar();
    }

    public static void inicializar() {
        GestionPremiacion premiacion = new GestionPremiacion(LocalDate.of(2021, 10, 10));

        // Crear un objeto de la clase modelo.Actor para la pelicula accion
        Actor actor1 = new Actor("Robert", "Downey Jr", "Estadounidense");
        Actor actor2 = new Actor("Chris", "Evans", "Estadounidense");
        Actor actor3 = new Actor("Mark", "Ruffalo", "Estadounidense");
        // Crear un objeto de la clase modelo.Director
        Director director1 = new Director("Joss", "Whedon", "Estadounidense");
        // Crear un objeto de la clase modelo.Pelicula accion
        Pelicula pelicula1 = new Pelicula(LocalDate.of(2012, 4, 11), "The Avengers", 143, "Sinopsis de The Avengers", CategoriasPeliculas.ACCION, director1);


        // Crear un objeto de la clase modelo.Actor para la pelicula accion
        Actor actor4 = new Actor("Chris", "Evans", "Estadounidense");
        Actor actor5 = new Actor("Scarlett", "Johansson", "Estadounidense");
        Actor actor6 = new Actor("Sebastian", "Stan", "Estadounidense");
        // Crear un objeto de la clase modelo.Director
        Director director2 = new Director("Anthony", "Russo", "Estadounidense");
        // Crear un objeto de la clase modelo.Pelicula accion
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
        premiacion.seleccionarPeliculaGanadoraCategoria(CategoriasPeliculas.ACCION);

        // uso metodo informarPeliculasGanadoras
        premiacion.informarPeliculasGanadoras();

        // uso metodo obtenerActoresPelicula
        premiacion.obtenerActoresPelicula(pelicula1);
        premiacion.obtenerActoresPelicula(pelicula2);

        // uso metodo listarDirectoresActoresPremiados
        System.out.println("\nDirectores y actores premiados: ");
        premiacion.listarDirectoresActoresPremiados();

    }

}
