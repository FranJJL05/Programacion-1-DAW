package Relacion11.ejer6;

import java.util.GregorianCalendar;

public class Alumno extends Persona {
    private String grupo;
    private double notaMedia;

    public Alumno(String nombre, String apellidos, GregorianCalendar fechaNaciem, String grupo, double notaMedia) {
        super(nombre, apellidos, fechaNaciem);
        this.grupo = grupo;
        this.notaMedia = notaMedia;
    }

    @Override
    public void mostrar() {
        System.out.println("Alumno: " + nombre + " " + apellidos);
        System.out.println("Fecha de nacimiento: " + fechaNacim.getTime());
        System.out.println("Grupo: " + grupo);
        System.out.println("Nota media: " + notaMedia);
    }

}
