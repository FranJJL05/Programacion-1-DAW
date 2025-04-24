package UD7_Excepciones.Relacion_13_Excepciones;

public class Ejer11 {
    public static void main(String[] args) {
        try {
            System.out.println(metodo());
        } catch (Exception e) {
            System.out.println("Excepción en método() ");
            e.printStackTrace();
        }
    }

    public static int metodo() throws NumberFormatException {
        int valor = 0;
        try {
            valor = valor + 1;
            valor = valor + Integer.parseInt("W");
            valor = valor + 1;
            System.out.println("Valor al final del try: " + valor);
        } catch (NumberFormatException e) {
            valor = valor + Integer.parseInt("42");
            System.out.println("Valor al final del catch: " + valor);
            throw e;
        } finally {
            valor = valor + 1;
            System.out.println("Valor al final del finally: " + valor);
        }
        valor = valor + 1;
        System.out.println("Valor antes del return: " + valor);
        return valor;
    }
}

/*El valor del Integer no es un numero, pasaria lo mismo que en el ejercicio anterior. */     