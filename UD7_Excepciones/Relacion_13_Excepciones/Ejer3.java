package UD7_Excepciones.Relacion_13_Excepciones;

public class Ejer3 {
    public static char caracterEn(String cadena, int posicion) throws Exception {
        if (posicion >= 0 && posicion < cadena.length()) {
            return cadena.charAt(posicion);
        } else {
            throw new Exception("Índice fuera de rango: " + posicion);
        }
    }
    public static void main(String[] args) {
        try {
            System.out.println(caracterEn("Hola mundo", 4));
            System.out.println(caracterEn("Hola", 10));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
