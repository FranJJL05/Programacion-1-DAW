package Ejercicio4;

import java.util.HashSet;

public class Media {
    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<>();

        /*Esto es para crear conjuntos 
         * numeros es aquello que queremos guardar
        */

        int suma = 0;

        numeros.add(4);
        numeros.add(3);
        numeros.add(2);
        numeros.add(1);
        numeros.add(5);

        for (Integer n : numeros) { /*En la variable n va a ir guardando los numeros que vea en cada pasada */
            suma = suma + n;   
        }

        System.out.println("La suma de los números del conjunto es: " + suma);

    }
}
