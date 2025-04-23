package UD7_Excepciones.Relacion_13_Excepciones;

public class Ejer3 {
    public static char caracterEn(String cadena, int posicion) throws Exception {
        if (posicion >= 0 && posicion < cadena.length()) {
            return cadena.charAt(posicion);
        } else {
            throw new Exception("Índice fuera de rango: " + posicion);
        }
    }
}
