package Ultimo_examen.Vehiculo;

public abstract class Comercial extends Vehiculo{

    protected String cargaMaz;
    protected double volumen;
    protected static int totalComerciales = 0;

    /*Constructor */
    public Comercial(String matricula, String marca, String modelo, String cargaMaz, double volumen, long kmRecorridos) {
        super(matricula, marca, modelo, kmRecorridos);
        this.cargaMaz = cargaMaz;
        this.volumen = volumen;
        totalComerciales ++;
    }

    public String getCargaMaz() {
        return cargaMaz;
    }

    public double getVolumen() {
        return volumen;
    }

    public static int getTotalComerciales() {
        return totalComerciales;
    }

    public void setCargaMaz(String cargaMaz) {
        this.cargaMaz = cargaMaz;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public static void setTotalComerciales(int totalComerciales) {
        Comercial.totalComerciales = totalComerciales;
    }
    
}
