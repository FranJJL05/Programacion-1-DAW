package Relacion11.ejer7_y_ejer9;

import java.util.Scanner;

public class TestsVehiculo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bicicleta bicicleta = new Bicicleta(0);
        Coche2 coche = new Coche2(0);
        int opcion; // Declaramos 'opcion' fuera del bucle

        do {
            System.out.println("VEHÍCULOS");
            System.out.println("==========");
            System.out.println("1. Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Arrancar coche");
            System.out.println("6. Detener coche");
            System.out.println("7. Conducir coche");
            System.out.println("8. Ver kilometraje de la bicicleta");
            System.out.println("9. Ver kilometraje del coche");
            System.out.println("10. Ver kilometraje total");
            System.out.println("11. Salir");
            System.out.print("Elige una opción (1-11): ");

            if (scanner.hasNextInt()) { // Comprobamos si la entrada es un entero
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiamos el buffer del scanner

                switch (opcion) {
                    case 1:
                        bicicleta.anda();
                        System.out.print("¿Cuántos kilómetros has recorrido? ");
                        int distanciaBici = scanner.nextInt();
                        scanner.nextLine();
                        bicicleta.kilometrosRecorridos += distanciaBici;
                        Vehiculo.kilometrosTotales += distanciaBici;
                        break;
                    case 2:
                        bicicleta.hazCaballito();
                        break;
                    case 3:
                        coche.anda();
                        System.out.print("¿Cuántos kilómetros has recorrido? ");
                        int distanciaCoche = scanner.nextInt();
                        scanner.nextLine();
                        coche.kilometrosRecorridos += distanciaCoche;
                        Vehiculo.kilometrosTotales += distanciaCoche;
                        break;
                    case 4:
                        coche.quemaRueda();
                        break;
                    case 5:
                        coche.arrancar();
                        break;
                    case 6:
                        coche.detener();
                        break;
                    case 7:
                        coche.conducir();
                        break;
                    case 8:
                        System.out.println("Kilometraje de la bicicleta: " + bicicleta.verKilometros() + " km");
                        break;
                    case 9:
                        System.out.println("Kilometraje del coche: " + coche.verKilometros() + " km");
                        break;
                    case 10:
                        System.out.println("Kilometraje total: " + Vehiculo.verKilometrosTotales() + " km");
                        break;
                    case 11:
                        System.out.println("Salir");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Opción no válida.");
                }
            } else {
                System.out.println("Entrada no válida. Introduce un número entero.");
                scanner.nextLine(); // Limpiamos el buffer del scanner
                opcion = 0; // Asignamos un valor que no sea 8 para que el bucle continúe
            }
        } while (opcion != 8);
    }
}
