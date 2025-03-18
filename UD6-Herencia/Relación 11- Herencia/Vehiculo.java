public abstract class Vehiculo {
    private static int vehiculosCreados = 0;
    static int kilometrosTotales = 0;
    protected int kilometrosRecorridos;

    public Vehiculo(int kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
        Vehiculo.vehiculosCreados++;
        Vehiculo.kilometrosTotales += kilometrosRecorridos;
    }

    public abstract void anda();

    public int verKilometraje() {
        return kilometrosRecorridos;
    }

    public static int verKilometrajeTotal() {
        return kilometrosTotales;
    }

}