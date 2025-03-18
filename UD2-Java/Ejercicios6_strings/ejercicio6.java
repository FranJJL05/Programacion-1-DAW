package Ejercicios6_strings;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {

        // Realizar un programa que dada una cadena de caracteres por caracteres, genere
        // otra cadena
        // resultado de invertir la primera.

        Scanner entrada = new Scanner(System.in);
        String cadena;
        String nuevacadena = "";

        System.out.print("Introduzca la cadena");
        cadena = entrada.nextLine();

        for (int i = cadena.length()-1; i>= 0; i--) {
            nuevacadena += cadena.charAt(i);
        }

        System.out.println(nuevacadena);

    }
}