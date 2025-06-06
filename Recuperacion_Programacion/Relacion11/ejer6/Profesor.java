package Relacion11.ejer6;

import java.util.GregorianCalendar;

public class Profesor extends Persona{
    private String especialidad;
    private double salario;

    public Profesor(String nombre, String apellidos, GregorianCalendar fechaNaciem, String especialidad, double salario) {
        super(nombre, apellidos, fechaNaciem);
        this.especialidad = especialidad;
        this.salario = salario;
    }

    @Override
    public void mostrar() {
        System.out.println("Profesor: " + nombre + " " + apellidos);
        System.out.println("Fecha de nacimiento: " + fechaNacim.getTime());
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Salario: " + salario);
    }


}