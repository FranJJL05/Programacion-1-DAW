package UD7_Excepciones.Relacion_13_Excepciones;

import java.util.Scanner;

public class ControlNumeroNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Introduce un número positivo");
            int numero = scanner.nextInt();

            if (numero < 0) {
                throw new NumeroNegativoExcepcion("El número no puede ser negativo");
            }
            System.out.println("Has introducido el número" + numero);
        } catch (NumeroNegativoExcepcion e) {
            System.out.println("Error" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado" + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
