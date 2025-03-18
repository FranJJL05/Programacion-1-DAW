package Ejercicios6_strings;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        // Realizar un programa que lea una cadena por teclado y convierta las
        // mayúsculas a minúsculas y
        // viceversa.

        String cadena, letra, nuevacadena = " ";
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        cadena = entrada.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            letra = cadena.substring(i, i + 1);
            if (letra.equals(letra.toUpperCase())) {
                nuevacadena = nuevacadena + letra.toLowerCase();
            }
            if (letra.equals(letra.toLowerCase())) {
                nuevacadena = nuevacadena + letra.toUpperCase();
            }

        }
        System.out.println(nuevacadena);
        entrada.close();
    }
}