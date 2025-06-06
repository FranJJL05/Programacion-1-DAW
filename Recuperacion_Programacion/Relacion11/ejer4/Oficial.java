package Relacion11.ejer4;

public class Oficial extends Operario{

    public Oficial(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return super.toString() + " -> Oficial";
    }
}
