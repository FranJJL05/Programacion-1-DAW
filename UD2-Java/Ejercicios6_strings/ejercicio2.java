package Ejercicios6_strings;

import java.util.Scanner;

public class ejercicio2 {
     public static void main(String[] args) {
          // Realizar un programa que comprueba si una cadena leída por teclado comienza
          // por una subcadena
          // introducida por teclado.
          String cadena;
          String subcadena;
          boolean comprobar;

          Scanner entrada1 = new Scanner(System.in);
          Scanner entrada2 = new Scanner(System.in);

          System.out.print("Introduce una cadena");
          cadena = entrada1.nextLine();

          System.out.print("Introduce la subcadena");
          subcadena = entrada2.nextLine();

          comprobar = cadena.startsWith(subcadena);

          if (comprobar == true) {
               System.out.println("Empieza por la subcadena");
          } else {
               System.out.println("No empieza por la subcadena");
          }

     }
}