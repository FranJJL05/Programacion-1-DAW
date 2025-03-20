import java.util.Scanner;

public class TestGestSimAlm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestSimAlm gestion = new GestSimAlm();
        int opcion;

        do {
            System.out.println("\nMenú de Gestión de Almacén");
            System.out.println("0. Entrada automatizada");
            System.out.println("1. Listado");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Entrada de mercancía");
            System.out.println("5. Salida de mercancía");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 0:
                    gestion.entradaAutomatizada();
                    break;
                case 1:
                    gestion.lista();
                    break;
                case 2:
                    System.out.print("Código del artículo: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Descripción del artículo: ");
                    String descripcion = scanner.nextLine();
                    Articulo nuevoArticulo = new Articulo(codigo, descripcion);
                    gestion.alta(nuevoArticulo);
                    break;
                case 3:
                    System.out.print("Código del artículo a eliminar: ");
                    String codigoBaja = scanner.nextLine();
                    gestion.baja(codigoBaja);
                    break;
                case 4:
                    System.out.print("Código del artículo: ");
                    String codigoEntrada = scanner.nextLine();
                    System.out.print("Cantidad a ingresar: ");
                    int cantidadEntrada = scanner.nextInt();
                    gestion.entradaMercancia(codigoEntrada, cantidadEntrada);
                    break;
                case 5:
                    System.out.print("Código del artículo: ");
                    String codigoSalida = scanner.nextLine();
                    System.out.print("Cantidad a retirar: ");
                    int cantidadSalida = scanner.nextInt();
                    gestion.salidaMercancia(codigoSalida, cantidadSalida);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 6);
        scanner.close();
    }
}
