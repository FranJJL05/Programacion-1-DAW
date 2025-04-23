package UD7_Excepciones.Relacion_13_Excepciones;

import java.util.Scanner;

public class Ejer4 {
    public static char caracterEn(String cadena, int posicion) throws Exception {
        if (posicion >= 0 && posicion < cadena.length()) {
            return cadena.charAt(posicion);
        } else {
            throw new Exception("Índice fuera de rango: " + posicion);
        }
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String cadena = entrada.nextLine();

        try {
            System.out.println(caracterEn(cadena, 4));
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

