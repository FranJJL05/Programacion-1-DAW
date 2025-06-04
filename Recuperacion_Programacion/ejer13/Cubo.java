package ejer13;

public class Cubo {
    private double capacidad;
    private double litrosMomento;

    public Cubo(double capacidad, double litrosMomento){
        this.capacidad = capacidad;
        this.litrosMomento = 0;
    }

   public double getLitrosMomento() {
       return litrosMomento;
   }

   public void setLitrosMomento(double litrosMomento) {
       this.litrosMomento = litrosMomento;
   }
   
   public void vaciar(){
        litrosMomento = 0;
   }
   
   public void llenar(double litros){
        litrosMomento += litros;
        if (litros + litrosMomento > litrosMomento) {
            litrosMomento = capacidad;
            System.out.println("El cubo está lleno, no caben más de " + capacidad);
        }
   }
}
