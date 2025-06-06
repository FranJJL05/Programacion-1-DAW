package Relacion11.ejer1_y_ejer2;

public class ProgramaPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        System.out.println(p1);

        System.out.println("---------------");
        Persona p2 = new Persona("123123123L", 142, 12);
        System.out.println(p2);

        System.out.println("---------------");
        Ingeniero i1 = new Ingeniero();
        i1.trabajarEnGrupo();

        IngenieroInformatico info1 = new IngenieroInformatico();
        info1.crearPrograma();
    }  
}
