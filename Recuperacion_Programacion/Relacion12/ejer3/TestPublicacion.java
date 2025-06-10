package Relacion12.ejer3;

import java.util.ArrayList;

public class TestPublicacion {
    public static void main(String[] args) {
        ArrayList<Publicacion> biblioteca = new ArrayList<>();

        biblioteca.add(new Libro("123-456", "El Hobbit", 1937));
        biblioteca.add(new Revista("789-012", "National Geographic", 2022, 305));
        biblioteca.add(new Libro("345-678", "Cien años de soledad", 1967));

        // Ordenar las publicaciones por título
        biblioteca.sort(null);

        // Imprimir las publicaciones ordenadas
        for (Publicacion p : biblioteca) {
            System.out.println(p);
        }
    }
}
