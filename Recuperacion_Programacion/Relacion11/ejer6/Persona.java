package Relacion11.ejer6;

import java.util.GregorianCalendar;

public abstract class Persona {
    protected String nombre;
    protected String apellidos;
    protected GregorianCalendar fechaNacim;

    public Persona(String nombre, String apellidos, GregorianCalendar fechaNaciem){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacim = fechaNaciem;
    }

    public abstract void mostrar();
}
