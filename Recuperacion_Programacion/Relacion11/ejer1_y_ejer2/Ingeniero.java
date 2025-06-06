package Relacion11.ejer1_y_ejer2;

public class Ingeniero extends Persona {
    
    /*El super() es para poder llamar a los constructores de la clase Persona */
    public Ingeniero(){
        super();
    }
    
    public void razonar(){
        System.out.println("EL ingeniero razona");
    }

    public void trabajarEnGrupo(){
        System.out.println("EL ingeniero trabaja en grupo");
    }

    public Ingeniero(String nif, int altura, int edad){
        super();
    }

}