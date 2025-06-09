package Relacion11.ejer7_y_ejer9;

import java.util.Scanner;

public class TestVehiculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bicicleta bici = new Bicicleta(5);
        Coche coche1 = new Coche(10);
        int opcion;

        do {
            System.out.println("VEHÍCULOS");
            System.out.println("=========");
            System.out.println("1. Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Anda el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Salir");
            System.out.println("Elige una opción (1-8)");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    bici.anda();
                    break;
                case 2:
                    bici.hazCaballito();
                    break;
                case 3:
                    coche1.anda();
                    break;
                case 4:
                    coche1.quemaRueda();
                    break;
                case 5:
                    bici.verKilometros();
                    break;
                case 6:
                    coche1.verKilometros();
                    break;
                case 7:
                    System.out.println("Kilometraje total: " + Vehiculo.verKilometrosTotales() + "km");
                    break;
                case 8:
                    System.out.println("Saliendo......");
                    scanner.close();
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        }while (opcion != 8);

    }
}
