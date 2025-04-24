package UD7_Excepciones.Relacion_13_Excepciones;

public class Ejer9 {

    public static double accesoPorIndice(double[] v, int j) throws Exception {
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

    public static void main(String[] args) throws Exception {
        double[] v = new double[15];
        System.out.println(accesoPorIndice(v, 16));
    }
}

/*Hay que poner el throws Exception en el programa principal. 
 * La excepción se lanza y no se maneja en main, por lo que el programa termina abruptamente con un error.

El catch dentro de accesoPorIndice no hace nada útil, ya que solo vuelve a lanzar la misma excepción.
 */