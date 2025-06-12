package Relacion10.ejer5_y_ejer6;

public class Biblioteca{
    public static void main(String[] args) {
        Autor autor1 = new Autor("Fran", "Española");
        Autor autor2 = new Autor("Antonio", "Francesa");


        Libro libro1 = new Libro("1234", "Caperucita", autor1);
        Libro libro2 = new Libro("4567", "Roja", autor2);
        Libro libro3 = new Libro("8901", "Lobo", autor1);

        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);

        System.out.println("------------");
        System.out.println("En la bibloteca hay: " + Libro.getNumLibros() + " libros");
        System.out.println("En la biblioteca hay: " + Autor.getNumAutor() + " autores");

        System.out.println("------------");
        Prestamos presta1 = new Prestamos("hoy", "mañana", libro1, "yo");
        System.out.println(presta1);

        System.out.println("------------");
        Prestamos presta2 = new Prestamos("ayer", "pasado mañana", libro2, "el");
        System.out.println(presta2);
        
        System.out.println("Se han prestado un total de " + Prestamos.getTotalPrestados() + " libros");
    }

}