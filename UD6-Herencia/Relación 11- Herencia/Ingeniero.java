public class Ingeniero extends Persona {
    
    /*El super() es para poder llamar a los constructores de la clase Persona */
    public Ingeniero(){
        super();
    }
    
    public void razonar(){
        System.out.println("Razona");
    }

    public void trabajarEnGrupo(){
        System.out.println("Trabaja en grupo");
    }

    public Ingeniero(String nif, int altura, int edad){
        super();
    }

}
