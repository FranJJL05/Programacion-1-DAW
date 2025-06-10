package Relacion11.ejer4_y_ejer5;

public class Directivo extends Empleado{

    public Directivo(String nombre) {
        super(nombre);
    }

    @Override
    public String salario() {
        return " -> El salario de un directivo es de 1200€";
    }
    
    @Override
    public String toString() {
        return super.toString() + " -> Directivo";
    }
}
