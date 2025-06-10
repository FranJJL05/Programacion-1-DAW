package Relacion11.ejer4_y_ejer5;

public class Oficial extends Operario{

    public Oficial(String nombre) {
        super(nombre);
    }

    @Override
    public String salario() {
        return " -> El salario de un oficial es de 1000€";
    }

    @Override
    public String toString() {
        return super.toString() + " -> Oficial";
    }
}
