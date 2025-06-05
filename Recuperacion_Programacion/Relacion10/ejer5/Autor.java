package Relacion10.ejer5;

public class Autor {
    private String nombre;
    private String nacionalidad;
    private static int numAutor = 0;


    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        numAutor ++;
    }

    public static int getNumAutor() {
        return numAutor;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " Nacionalidad: " + nacionalidad;
    }

}
