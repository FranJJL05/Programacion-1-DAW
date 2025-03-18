import java.util.GregorianCalendar;

public class Alumno extends Persona2 {
    String grupo;
    double notaMedia;

    //Constructor de la clase alumno
    public Alumno(String nombre, String apellidos, GregorianCalendar fechaNacim, String grupo, double notaMedia){ 
        super(nombre, apellidos, fechaNacim);
        this.grupo = grupo;
        this.notaMedia = notaMedia;    
    }

    //Implementación del método mostrar para el Alumno
    @Override
    public void mostrar(){
        System.out.println("Alumno: " + nombre + " " + apellidos);
        System.out.println("Fecha de nacimiento: " + fechaNacim.getTime());
        System.out.println("Grupo: " + grupo);
        System.out.println("Nota media: " + notaMedia);
    }    
}
