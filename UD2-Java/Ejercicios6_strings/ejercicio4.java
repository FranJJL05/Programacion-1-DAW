package Ejercicios6_strings;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        // Suponiendo que hemos introducido una cadena por teclado que representa una
        // frase (palabras
        // separadas por espacios), realiza un programa que cuente cuántas palabras
        // tiene.

        String cadena;
        int contador = 1;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce una cadena");
        cadena = entrada.nextLine().trim();

        for (int i = 1; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ' ') {
                contador++;
            }

        }

        System.out.println("La cadena tiene " + contador + " palabras");
    }
}
