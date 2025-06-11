package Relacion9.ejer13;

public class ProgramaCubo {
     public static void main(String[] args) {
        Cubo miCubo = new Cubo(10.0, 0.0);

        System.out.println("Litros en el cubo al inicio: " + miCubo.getLitrosMomento());

        miCubo.llenar(5.0);
        System.out.println("Litros en el cubo después de llenar con 5 litros: " + miCubo.getLitrosMomento());

        miCubo.llenar(10.0);
        System.out.println("Litros en el cubo después de intentar llenar con 10 litros: " + miCubo.getLitrosMomento());

        miCubo.vaciar();
        System.out.println("Litros en el cubo después de vaciar: " + miCubo.getLitrosMomento());
    }
}
