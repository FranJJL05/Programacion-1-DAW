package Relacion12.ejer1;

public class TestMenu {
    public static void main(String[] args) {
        Menu menu = new Menu();

        menu.crearOpcion("Opcion 1");
        menu.crearOpcion("Opcion 2");
        menu.crearOpcion("Opcion 3");
        menu.crearOpcion("Opcion 4");

        menu.muestraMenu();

        int opcion = menu.capturarOpcion();
        System.out.println("La opcion seleccionada es la " + opcion);
    }
}
