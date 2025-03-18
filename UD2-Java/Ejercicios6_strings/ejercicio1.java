package Ejercicios6_strings;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        String frase;
        char caracter;

        System.out.print("Introduce una cadena");
        Scanner entrada = new Scanner(System.in);
        frase = entrada.nextLine();

        // Escribir por pantalla cada carácter de una cadena introducida por teclado.
        for (int i = 0; i < frase.length(); i++) {
            caracter = frase.charAt(i);
            System.out.println(caracter);
        }
        entrada.close();
    }
}