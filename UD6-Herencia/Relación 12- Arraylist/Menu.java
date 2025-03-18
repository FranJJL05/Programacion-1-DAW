import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private ArrayList<String> opciones;

    public Menu() {
        opciones = new ArrayList<>();
    }

    public void creaOpcion(String opcion) {
        opciones.add(opcion);
    }

    public void muestraMenu() {
        System.out.println("=== MENÚ ===");
        for (int i = 0; i < opciones.size(); i++) {
            System.out.println((i + 1) + ". " + opciones.get(i));
        }
        System.out.println("------------");
    }

    // Método para capturar la opción seleccionada por el usuario
    public int capturaOpcion() {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.print("Introduce una opción (1-" + opciones.size() + "): ");
            opcion = entrada.nextInt();
        } while (opcion < 1 || opcion > opciones.size());

        entrada.close();
        return opcion;
    }
}