package UD7_Excepciones.Relacion_13_Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer12 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[6];
        int contador = 0;

        while (contador < 6) {
            System.out.println("Introduce el numero " + (contador+1));
            try {
                int numero = entrada.nextInt();
                numeros[contador] = numero;
                contador ++;
            } catch (InputMismatchException e) {
                System.out.println("ERROR tienes que introducir un numero entero");
                entrada.next();
            }
        }

        int maximo = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }

        System.out.println("El número máximo es: " + maximo);
        
        entrada.close();
    }
}
