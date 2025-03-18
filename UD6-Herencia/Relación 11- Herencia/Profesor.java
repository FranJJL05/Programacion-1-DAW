import java.util.GregorianCalendar;

public class Profesor extends Persona2 {
    String especialidad;
    double salario;

    //Constructor de la clase Profesor
    public Profesor(String nombre, String apellido, GregorianCalendar fechaNacim, String especialidad, double salario){
        super(nombre, apellido, fechaNacim);
        this.especialidad = especialidad;
        this.salario = salario;
    }

    //Implementación del método mostrar para Profesor
    @Override
    public void mostrar() {
        System.out.println("Profesor: " + nombre + " " + apellidos);
        System.out.println("Fecha de nacimiento: " + fechaNacim.getTime());
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Salario: " + salario);
    }
}
