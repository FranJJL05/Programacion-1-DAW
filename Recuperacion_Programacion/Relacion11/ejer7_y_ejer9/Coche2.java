package Relacion11.ejer7_y_ejer9;

import UD6-Herencia.Relación 11- Herencia.Arrancable;

    public class Coche2 extends Vehiculo implements Arrancable {

    private boolean arrancado;

    public Coche2(int kilometrosRecorridos) {
        super(kilometrosRecorridos);
        this.arrancado = false;
    }

    public void anda() {
        System.out.println("Conduciendo el coche...");
    }

    public void quemaRueda() {
        System.out.println("¡Quemando rueda con el coche!");
    }

    public void arrancar() {
        if (!arrancado) {
            arrancado = true;
            System.out.println("El coche ha arrancado.");
        } else {
            System.out.println("El coche ya está arrancado.");
        }
    };

    public void detener() {
        if (arrancado) {
            arrancado = false;
            System.out.println("El coche se ha detenido.");
        } else {
            System.out.println("El coche ya está detenido.");
        };
    }

    public boolean estaArrancado() {
        return arrancado;
    }

    public void conducir() {
        if (arrancado) {
            System.out.println("El coche es está conduciendo");;
        }else{
            System.out.println("El coche no está arrancado");
        }
    }
}
}
