package Ejercicios6_strings;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {

        // Si tenemos una cadena con un nombre y apellidos, realizar un programa que
        // muestre las iniciales en
        // mayúsculas.

        String cadena;
        String nuevacadena = " ";

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce una cadena con un nombre y apellidos");
        cadena = entrada.nextLine();

        nuevacadena += Character.toUpperCase(cadena.charAt(0));

        for (int i = 1; i < cadena.length(); i++) {
            // Tomamos la primera letra de cada palabra y la convertimos a mayúsculas
            char actual = cadena.charAt(i);
            if (actual == ' ' && i + 1 < cadena.length()) {
                nuevacadena += Character.toUpperCase(cadena.charAt(i + 1));
            }
        }

        System.out.println("Las iniciales son" + nuevacadena);

    }
}
