package Ejercicios6_strings;

import java.util.Scanner;

//Realizar un programa que compruebe si una cadena contiene una subcadena. Las dos cadenas se
//introducen por teclado.


public class ejercicio9 {
    public static void main(String[] args) {

        String cadena, subcadena;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        cadena = entrada.nextLine();

        System.out.print("Introduce una subcadena: ");
        subcadena = entrada.nextLine();

        if (cadena.contains(subcadena)) {
            System.out.println("La subcadena está en la cadena");
        } else {
            System.out.println("La subcadena NO está en la cadena");
        }
        entrada.close();

    }

}
