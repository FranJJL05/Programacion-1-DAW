public class Fraccion {
   int numerador;
   int denominador;


   public Fraccion(int numerador, int denominador) {
    this.numerador = numerador;
    this.denominador = denominador;
   }

   public void invierte(int numerador1, int denominador1){
    numerador = denominador1;
    denominador = numerador1;
   }

   public void simplifica(){

   }

   public void multiplica(int numerador2, int denominador2, int numerador3, int denominador3){
    numerador3 = numerador * numerador2;
    denominador3 = denominador * denominador2;

    System.out.println("La multiplicacion de las fraciones es de " + numerador3 + "/" + denominador3);
   }

   public void divide(int numerador2, int denominador2, int numerador3, int denominador3){
    numerador3 = numerador / numerador2;
    denominador3 = denominador / denominador2;

    System.out.println("La multiplicacion de las fraciones es de " + numerador3 + "/" + denominador3);
   }
}
