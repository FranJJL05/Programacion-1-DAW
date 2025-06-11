package Relacion9.ejer6;
import java.util.Scanner;

public class ProgramaFraccion {
    public static void main(String[] args) {
        int numerador, numerador2;
        int denominador, denominador2;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el numerador");
        numerador = entrada.nextInt();

        System.out.println("Introduce el denominador");
        denominador = entrada.nextInt();

        Fraccion fraccion1 = new Fraccion(numerador, denominador);

        System.out.println(fraccion1);

        System.out.println("Introduce el numerador2");
        numerador2 = entrada.nextInt();

        System.out.println("Introduce el denominador2");
        denominador2 = entrada.nextInt();

        fraccion1.multiplica(numerador, denominador, numerador2, denominador2);
        
        fraccion1.divide(numerador, denominador, numerador2, denominador2);

        fraccion1.invierte(numerador2, denominador2);
    }    
}
