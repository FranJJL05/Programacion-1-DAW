package Relacion11.ejer4_y_ejer5;


public abstract class Empleado {
    protected String nombre;
    
    /*Constructor */
    public Empleado(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract String salario();

    @Override
    public String toString() {
        return "Empleado " + nombre;
    }
}
