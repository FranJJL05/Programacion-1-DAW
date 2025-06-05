package Relacion10.ejer2;

import java.util.Scanner;

public class ProgramaArticulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Articulo[] articulos = new Articulo[3];
        
        for (int i = 0; i < articulos.length; i++) {
            System.out.println("Introduce el código del artículo " + (i+1));
            String codigo = scanner.nextLine();

            System.out.println("Escribe la descripcion del artículo ");
            String descripcion = scanner.nextLine();

            
            articulos[i] = new Articulo(codigo, descripcion);
        }

        for (int i = 0; i < articulos.length; i++) {
            System.out.println(articulos[i]);
        }
    }

}
