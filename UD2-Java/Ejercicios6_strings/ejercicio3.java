package Ejercicios6_strings;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        // Pide una cadena y un carácter por teclado (valida que sea un carácter) y
        // muestra cuántas veces
        // aparece el carácter en la cadena

        char caracter;
        String cadena;
        int contador = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce una cadena");
        cadena = entrada.nextLine();

        System.out.print("Introduce un carácter");
        caracter = entrada.next().charAt(contador);

        int longitud = cadena.length();

        for (int i = 0; i < longitud; i++) {
            if (cadena.charAt(i) == caracter) {
                contador++;
            }

        }
        System.out.println("El carácter " + caracter + " aparece " + contador + " veces");

    }
}