package Relacion11.ejer7_y_ejer9;

public abstract class Vehiculo {
    protected static int vehiculosCreados = 0 ;
    protected static int kilometrosTotales = 0;
    protected int kilometrosRecorridos;


    public Vehiculo(int kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
        vehiculosCreados++;
        kilometrosTotales += kilometrosRecorridos;
    }

    public abstract void anda();

    public int verKilometros(){
        return kilometrosRecorridos;
    }

    public static int verKilometrosTotales(){
        return kilometrosTotales;
    }
    
}
