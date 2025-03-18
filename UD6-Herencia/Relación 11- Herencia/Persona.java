public class Persona{
    private String nif;
    private int altura;
    private int edad;

    /*Constructor por defecto */
    public Persona(){
        nif = "11111111A";
        altura = 175;
        edad = 25;
    }

    /*Contructor para añadirle los parámetros */
    public Persona(String nif, int altura, int edad){
        this.nif = nif;
        this.altura = altura;
        this.edad = edad;
    }

    public String getNif(){
        return nif;
    }

    public int getAltura(){
        return altura;
    }

    public int getEdad(){
        return edad;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString(){
        return "Persona: " + nif + " con " + altura + " cm de altura " + "y con " + edad + " años" ;
    }

    //Metodos del ejercicio 2
    public void hablar(){
        System.out.println("Habla");
    }

    public void comer(){
        System.out.println("Come");
    }
}
