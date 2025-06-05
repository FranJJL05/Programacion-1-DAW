package Relacion10.ejer1;

import java.util.Scanner;

public class ProgramaAutobus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Autobus[] bus = new Autobus[4];

        for (int i = 0; i < bus.length; i++) {
            System.out.println("Introduce los datos del bus: " + (i + 1 ));

            System.out.println("Matricula: ");
            String matricula = scanner.nextLine();

            System.out.println("Modelo: ");
            String modelo = scanner.nextLine();

            System.out.println("Potencia en CV: ");
            int potenciaCV = scanner.nextInt();

            System.out.println("Numero de plazas: ");
            int numeroPlazas = scanner.nextInt();

            scanner.nextLine();
            
            bus[i] = new Autobus(matricula, modelo, potenciaCV, numeroPlazas);
        }

        System.out.println("Listado informacion de todos los buses");
        for (int i = 0; i < bus.length; i++) {
            System.out.println(bus[i]);
        }

        scanner.close();
    }
}
