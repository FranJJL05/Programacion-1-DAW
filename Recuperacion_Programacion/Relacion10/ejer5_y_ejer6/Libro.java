package Relacion10.ejer5_y_ejer6;

public class Libro {
    private String codigo;
    private String titulo;
    Autor autor;
    private static int numLibros = 0;


    public Libro(String codigo, String titulo, Autor autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        numLibros ++;
    }

    public static int getNumLibros() {
        return numLibros;
    }

   @Override
   public String toString() {
       return "Código del libro: " + codigo + " Título: " + titulo + " -Autor- " + autor;
   } 
}
