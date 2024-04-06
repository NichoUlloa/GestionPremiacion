package modelo;

public enum CategoriasPeliculas {
    COMEDIA("Comedia"), ACCION("Accion"), TERROR("Terror");

    private String categoria;

    private CategoriasPeliculas(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Categoria: " + categoria + "\n";
    }
}
