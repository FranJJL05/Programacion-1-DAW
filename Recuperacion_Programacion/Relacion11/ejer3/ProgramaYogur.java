package Relacion11.ejer3;

public class ProgramaYogur {
    public static void main(String[] args) {
        Yogur normal = new Yogur();
        YogurDesnatado desnatado = new YogurDesnatado();

        System.out.println("El yogur normal tiene " + normal.getCalorias() + " calorías");
        System.out.println("El yogur desnatado tiene " + desnatado.getCalorias() + " calorías");
    }
}
