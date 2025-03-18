public class TestPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona("22222222F", 180, 24);

        System.out.println(p1);
        System.out.println(p2);
        
        p1.setEdad(20);
        p1.setAltura(132);

        System.out.println(p1);

        Ingeniero i1 = new Ingeniero();
        System.out.println(i1.getAltura());

        IngenieroInformatico info1 = new IngenieroInformatico();
        System.out.println(info1.getEdad());


    }
}
