package Relacion11.ejer4_y_ejer5;

public class Tecnico extends Operario{

    public Tecnico(String nombre) {
        super(nombre);
    }
    
    @Override
    public String salario() {
        return " -> El salario de un técnico es de 900€";
    }

    @Override
    public String toString() {
        return super.toString() + " -> Técnico";
    }
}
