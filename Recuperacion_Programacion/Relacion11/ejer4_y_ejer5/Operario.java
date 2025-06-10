package Relacion11.ejer4_y_ejer5;

public class Operario extends Empleado{

    public Operario(String nombre) {
        super(nombre);
    }
    
    @Override
    public String salario() {
        return " -> El salario de un operario es de 1000€";
    }


    @Override
    public String toString() {
        return super.toString() + " -> Operario";
    }
}
