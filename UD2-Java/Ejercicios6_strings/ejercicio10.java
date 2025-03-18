package Ejercicios6_strings;

import java.util.Scanner;

//Introducir una cadena de caracteres e indicar si es un palíndromo. Una palabra palíndroma es aquella
//que se lee igual adelante que atrás.

public class ejercicio10 {
    public static void main(String[] args) {
        String cadena, cadenainvertida = "";
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduzca una cadena: ");
        cadena = entrada.nextLine();

        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenainvertida += cadena.charAt(i);
        }

        if (cadenainvertida.equals(cadena)) {
            System.out.println("Es una palabra palíndroma");
        } else {
            System.out.println("No es una palabra palíndroma");
        }
        entrada.close();

    }
}
