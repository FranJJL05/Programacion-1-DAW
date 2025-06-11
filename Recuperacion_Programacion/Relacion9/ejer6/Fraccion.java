package Relacion9.ejer6;
public class Fraccion {
   int numerador;
   int denominador;

   /*Constructor */
   public Fraccion(int numerador, int denominador) {
    this.numerador = numerador;
    this.denominador = denominador;
   }

   /*Métodos */
   public void invierte(int numerador1, int denominador1){
    numerador = denominador1;
    denominador = numerador1;

    System.out.println("La fracción invertida quedaría como " + numerador + "/" + denominador);
   }

   public void multiplica(int numerador, int denominador, int numerador2, int denominador2){
    numerador = numerador * numerador2;
    denominador = denominador * denominador2;

    System.out.println("La multiplicacion de las fraciones es de " + numerador + "/" + denominador);
   }

   public void divide(int numerador, int denominador, int numerador2, int denominador2){
    numerador = numerador * denominador2;
    denominador = denominador * numerador2;

    System.out.println("La division de las fraciones es de " + numerador + "/" + denominador);
   }

   @Override
   public String toString(){
      return "La fraccion resultante queda como " + numerador + "/" + denominador;
   }
}
