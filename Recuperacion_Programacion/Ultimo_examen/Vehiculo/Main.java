package Ultimo_examen.Vehiculo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Vehiculo> lista = new ArrayList<>();

        Turismo t1 =  new Turismo(null, null, null, null, 0, 0);
        Turismo t2 = new Turismo(null, null, null, null, 0, 0);
        Turismo t3 = new Turismo(null, null, null, null, 0, 0);

        Furgo f1 = new Furgo(null, null, null, null, 0, 0, false, false);
        Furgo f2 = new Furgo(null, null, null, null, 0, 0, false, false);

        Camion c1 = new Camion(null, null, null, null, 0, false, false);
        Camion c2 = new Camion(null, null, null, null, 0, false, false);

        lista.add(t1);
        lista.add(t2);
        lista.add(t3);

        lista.add(f1);
        lista.add(f2);

        lista.add(c1);
        lista.add(c2);

        t1.alquilar();
        t1.alquilar();
        t1.devolver();
        t1.devolver();

        System.out.println("En que estado está el camión " + c1.estaAlquilado());
        c1.alquilar();
        System.out.println("En que estado está el camión " + c1.estaAlquilado());

        System.out.println("Totales");
        System.out.println("Turismos creados: " + Turismo.getTotalTurismos());
        System.out.println("Furgonetas creadas: " + Furgo.getTotalFurgonetas());
        System.out.println("Camiones creados: " + Camion.getTotalCamiones());
        System.out.println("Vehículos creados: " + Vehiculo.getTotalVehiculos());

    }
}
