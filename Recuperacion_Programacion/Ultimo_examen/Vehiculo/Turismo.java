package Ultimo_examen.Vehiculo;

public class Turismo extends Vehiculo {

    private String color;
    private int nPlazas;
    private int nPuertas;
    private static int totalTurismos = 0;
    private int KMLIMITE = 1000;

    /* Constructor */
    public Turismo(String matricula, String marca, String modelo, String color, int nPlazas, int nPuertas, long kmRecorridos) {
        super(matricula, marca, modelo, kmRecorridos);
        this.color = color;
        this.nPlazas = nPlazas;
        this.nPuertas = nPuertas;
        this.kmRecorridos = kmRecorridos;
        totalTurismos ++;
    }

    public String getColor() {
        return color;
    }

    public int getnPlazas() {
        return nPlazas;
    }

    public int getnPuertas() {
        return nPuertas;
    }

    public static int getTotalTurismos() {
        return totalTurismos;
    }

    public int getKMLIMITE() {
        return KMLIMITE;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setnPlazas(int nPlazas) {
        this.nPlazas = nPlazas;
    }

    public void setnPuertas(int nPuertas) {
        this.nPuertas = nPuertas;
    }

    public static void setTotalTurismos(int totalTurismos) {
        Turismo.totalTurismos = totalTurismos;
    }

    public void setKMLIMITE(int kMLIMITE) {
        KMLIMITE = kMLIMITE;
    }

    @Override
    public void devolver() {
        if (alquilado) {
            System.out.println("EL turismo ha sido devuelto");
            alquilado = false;
            kmRecorridos += 100;
            if (kmRecorridos > KMLIMITE) {
                System.out.println("¡Ha superado el límite de kilómetros del turismo!");
            }else{
                System.out.println("Has realizado " + kmRecorridos + "km");
            }
        } else {
            System.out.println("El turismo no se puede devolver porque no está alquilado");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Color: " + color + " Nº Plazas: " + nPlazas + " Nº Puertas: " + nPuertas;
    }
}
