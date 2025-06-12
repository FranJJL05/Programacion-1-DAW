package Ultimo_examen.Vehiculo;

public class Furgo extends Comercial {

    private int nPlazas;
    private boolean baca;
    private boolean puertaLateral;
    private static int totalFurgonetas = 0;
    private int KMLIMITE = 2000;;

    /* Constructor */
    public Furgo(String matricula, String marca, String modelo, String cargaMaz, double volumen, int nPlazas,
            boolean baca, boolean puertaLateral) {
        super(matricula, marca, modelo, cargaMaz, volumen);
        this.nPlazas = nPlazas;
        this.baca = baca;
        this.puertaLateral = puertaLateral;
        totalFurgonetas++;
    }

    /* Métodos */
    public int getnPlazas() {
        return nPlazas;
    }

    public boolean isBaca() {
        return baca;
    }

    public boolean isPuertaLateral() {
        return puertaLateral;
    }

    public static int getTotalFurgonetas() {
        return totalFurgonetas;
    }

    public int getKMLIMITE() {
        return KMLIMITE;
    }

    public void setnPlazas(int nPlazas) {
        this.nPlazas = nPlazas;
    }

    public void setBaca(boolean baca) {
        this.baca = baca;
    }

    public void setPuertaLateral(boolean puertaLateral) {
        this.puertaLateral = puertaLateral;
    }

    public static void setTotalFurgonetas(int totalFurgonetas) {
        Furgo.totalFurgonetas = totalFurgonetas;
    }

    public void setKMLIMITE(int kMLIMITE) {
        KMLIMITE = kMLIMITE;
    }

    @Override
    public void devolver() {
        if (alquilado) {
            System.out.println("La furgoneta ha sido devuelta");
            alquilado = false;
        } else {
            System.out.println("La furgoneta no se puede devolver porque no está alquilado");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Nº de plazas: " + nPlazas + " Baca: " + baca + " Puerta Lateral: " + puertaLateral;
    }

}
