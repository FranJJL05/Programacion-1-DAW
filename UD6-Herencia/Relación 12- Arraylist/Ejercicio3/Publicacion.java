package Ejercicio3;

// Clase Publicacion
public abstract class Publicacion implements Comparable<Publicacion> {
    protected String isbn;
    protected String titulo;
    protected int año;

    public Publicacion(String isbn, String titulo, int año) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.año = año;
    }

    public String getTitulo() {
        return titulo;
    }

    public int compareTo(Publicacion otra) {
        return this.titulo.compareTo(otra.titulo);
    }

    @Override
    public String toString() {
        return "ISBN: " + isbn + ", Título: " + titulo + ", Año: " + año;
    }
}
