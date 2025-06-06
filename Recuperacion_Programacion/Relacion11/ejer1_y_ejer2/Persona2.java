package Relacion11.ejer1_y_ejer2;

import java.util.GregorianCalendar;

public abstract class Persona2 {
    String nombre;
    String apellidos;
    GregorianCalendar fechaNacim;

    //Constructor de la clase Persona2
    public Persona2(String nombre, String apellidos, GregorianCalendar fechaNaciem){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacim = fechaNaciem;
    }

    
    public abstract void mostrar();
}
