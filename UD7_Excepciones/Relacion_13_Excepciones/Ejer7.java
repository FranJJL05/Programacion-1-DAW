package UD7_Excepciones.Relacion_13_Excepciones;

public class Ejer7 {
    public static double accesoPorIndice(double[] v, int j) throws Exception {
        try {
            if ((0 <= j) && (j <= v.length - 1)) {
                return v[j];
            } else {
                throw new Exception("El índice " + j + " no existe en el array.");
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
/*Lo que ocurría era que el programa principal faltaba añadir el throws Exception 
y el RuntimeException de accesoPorIndice había que cambiarlo por Exception*/