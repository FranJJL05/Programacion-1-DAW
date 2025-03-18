package Ejercicios6_strings;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {

        // Pide una cadena y dos caracteres por teclado (valida que sea un carácter),
        // sustituye la aparición del
        // primer carácter en la cadena por el segundo carácter

        Scanner entrada = new Scanner(System.in);
        String cadena, nuevacadena = " ";
        char caracter1, caracter2;

        System.out.print("Introduzca la cadena");
        cadena = entrada.nextLine();

        System.out.print("Introduzca el primer carácter");
        caracter1 = entrada.next().charAt(0);

        System.out.print("Introduzca el segundo carácter");
        caracter2 = entrada.next().charAt(0);

        for (int i = 0; i < cadena.length(); i++) {
            char actual = cadena.charAt(i);
            if (actual == caracter1) {
                nuevacadena += caracter2;

            } else {
                nuevacadena += actual;
            }

        }

        System.out.println(nuevacadena);

    }
}