package Relacion9.ejer9;

public class ProgramaTiempo{
    public static void main(String[] args) {
        Tiempo t1 = new Tiempo(1,30,40);
        Tiempo t2 = new Tiempo(0, 25, 20);

        Tiempo suma = t1.suma(t2);
        System.out.println("Suma: " + suma);

        Tiempo resta = t1.resta(t2);
        System.out.println("Resta: " + resta);

    }

}