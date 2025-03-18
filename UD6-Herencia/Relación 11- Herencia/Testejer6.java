import java.util.GregorianCalendar;

public class Testejer6 {
 public static void main(String[] args) {
    //Crear objetos de tipo Alumno y Profesor
    Alumno alumno = new Alumno("Juan", "Pérez", new GregorianCalendar(2003,4,15),"A1",8.5);
    Profesor profesor = new Profesor ("María", "López", new GregorianCalendar(1984,7,22),"Matemáticas",3000.00);

    //Mostrar la información de los objetos utilizando el método mostrar()
    System.out.println("-----Información del Alumno:-----");
    alumno.mostrar();
    System.out.println("-----Información del Profesor:-----");
    profesor.mostrar();
 }   
}
