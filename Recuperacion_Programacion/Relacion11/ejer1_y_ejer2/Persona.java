package Relacion11.ejer1_y_ejer2;

public class Persona {
    private String nif;
    private int altura;
    private int edad;


    public Persona() {
        this.nif = "11111111A";
        this.altura = 175;
        this.edad = 25;
    }

    public Persona(String nif, int altura, int edad) {
        this.nif = nif;
        this.altura = altura;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "NIF: " + nif + "\nAltura: " + altura + "\nEdad: " + edad;
    }

     //Metodos del ejercicio 2
    public void hablar(){
        System.out.println("Habla");
    }

    public void comer(){
        System.out.println("Come");
    }
}