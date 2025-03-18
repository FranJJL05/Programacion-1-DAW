public class Empleado {
    private String nombre;

    public Empleado() {
        this.nombre = "nombre";
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String setNombre(){
        return nombre;
    }

    @Override
    public String toString() {
        return "Empleado " + nombre;
    }
}
