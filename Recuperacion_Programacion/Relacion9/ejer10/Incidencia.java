package Relacion9.ejer10;

public class Incidencia {
    private int numPuesto;
    private String estado = "Pendiente";
    private String fallo;
    private static int pendiente = 0;
    private String solucion = " ";


    public Incidencia(int numPuesto, String fallo) {
        this.numPuesto = numPuesto;
        this.fallo = fallo;
        pendiente ++;
    }

    public void resuelve(String solucion1){
        estado = "Resuelta";
        pendiente --;
        solucion = solucion + "-" + solucion1;
    }

    public static int getPendiente() {
        return pendiente;
    }


    @Override
    public String toString(){
        return "Puesto: " + numPuesto + " - " + fallo + " - " + estado + solucion;
    }

}
