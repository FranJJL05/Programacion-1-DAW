package Ultimo_examen.Vehiculo;

public class Camion extends Comercial {

    private boolean volquete;
    private boolean cerrado;
    private static int totalCamiones = 0;
    private int KMLIMITE = 2500;;

    /* Constructor */
    public Camion(String matricula, String marca, String modelo, String cargaMaz, double volumen, boolean volquete,
            boolean cerrado) {
        super(matricula, marca, modelo, cargaMaz, volumen);
        this.volquete = volquete;
        this.cerrado = cerrado;
        totalCamiones ++;
    }

    public boolean isVolquete() {
        return volquete;
    }

    public void setVolquete(boolean volquete) {
        this.volquete = volquete;
    }

    public boolean isCerrado() {
        return cerrado;
    }

    public void setCerrado(boolean cerrado) {
        this.cerrado = cerrado;
    }

    public static int getTotalCamiones() {
        return totalCamiones;
    }

    public static void setTotalCamiones(int totalCamiones) {
        Camion.totalCamiones = totalCamiones;
    }

    public int getKMLIMITE() {
        return KMLIMITE;
    }

    public void setKMLIMITE(int kMLIMITE) {
        KMLIMITE = kMLIMITE;
    }

    @Override
    public void devolver() {
        if (alquilado) {
            System.out.println("El camión ha sido devuelto");
            alquilado = false;
        } else {
            System.out.println("El camión no se puede devolver porque no está alquilado");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Volquete: " + volquete + " Cerrado: " + cerrado;
    }
}
