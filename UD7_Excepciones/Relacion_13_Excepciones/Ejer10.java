package UD7_Excepciones.Relacion_13_Excepciones;

public class Ejer10 {
    public static void main(String[] args) {
        try {
            System.out.println(metodo());
        } catch (Exception e) {
            System.out.println("Excepción en método() ");
            e.printStackTrace();
        }
    }

    public static int metodo() {
        int valor = 0;
        try {
            valor = valor + 1;
            valor = valor + Integer.parseInt("hola");
            valor = valor + 1;
            System.out.println("Valor al final del try: " + valor);
        } catch (NumberFormatException e) {
            valor = valor + Integer.parseInt("42");
            System.out.println("Valor al final del catch: " + valor);
        } finally {
            valor = valor + 1;
            System.out.println("Valor al final del finally: " + valor);
        }
        valor = valor + 1;
        System.out.println("Valor antes del return: " + valor);
        return valor;
    }
}

/*Cambiando el valor Integer.parseInt(42) por "hola" me muestra solo a partir del valor al final del catch, el valor final del tryu no me lo mustra porque daría error. */

