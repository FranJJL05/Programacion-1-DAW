import java.util.Scanner;

public class ProgramaFraccion {
    public static void main(String[] args) {
        int numerador;
        int denominador;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el numerador");
        numerador = entrada.nextInt();

        System.out.println("Introduce el denominador");
        denominador = entrada.nextInt();

        Fraccion fraccion1 = new Fraccion(numerador, denominador);

        

    }    
}
