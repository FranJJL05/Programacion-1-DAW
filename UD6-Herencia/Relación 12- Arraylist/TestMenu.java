public class TestMenu {
    public static void main(String[] args) {
        Menu menu = new Menu(); // Crear un menú

        // Agregar opciones al menú
        menu.creaOpcion("Opcion 1");
        menu.creaOpcion("Opcion 2");
        menu.creaOpcion("Opcion 3");
        menu.creaOpcion("Opcion 4");
        menu.creaOpcion("Opcion 5");

        // Mostrar el menú
        menu.muestraMenu();

        // Capturar la opción elegida
        int opcionSeleccionada = menu.capturaOpcion();
        System.out.println("Has seleccionado: " + opcionSeleccionada);
    }
    azdasdasd
}