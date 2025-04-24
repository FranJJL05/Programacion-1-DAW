package UD7_Excepciones.Relacion_13_Excepciones;

public class Ejer6 {
    public static double accesoPorIndice(double[] v, int j) throws RuntimeException {
        try {
            if ((0 <= j) && (j <= v.length - 1)) {
                return v[j];
            } else {
                throw new RuntimeException("El índice " + j + " no existe en el array.");
            }
        } catch (RuntimeException exc) {
            throw exc;
        }
    }

    public static void main(String[] args) {
        double[] v = new double[15];
        System.out.println(accesoPorIndice(v, 16));
    }

}
/*
 * Se lanza la excepcion RuntimeEException, luego se propaga al main, pero éste
 * no tiene ningún manejador de excepciones
 * Solucion: o no propagar la excepcion, y manejar el método de la excepcion, o
 * propagar la excepcion al main,y crear un
 * manejador de excepciones en main
 * 
 * public static void main(String[] args) {
 * double[] v = new double[15];
 * try{
 * System.out.println(accesoPorIndice(v, 16));
 * }
 * catch(RuntimeException e){
 * System.out.println("Error!!!" + e.getMessage);
 * }
 * }
 */
