package Relacion12.ejer1;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<String> opciones = new ArrayList<>();

    public void crearOpcion(String opcion){
        opciones.add(opcion);
    }

    public void muestraMenu(){
        System.out.println("-- MENÚ --");
        for (int i = 0; i < opciones.size(); i++) {
            System.out.println(opciones.get(i));
        }
        System.out.println("---------------------");
    }

    public int capturarOpcion(){
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do{
            System.out.println("Introduce una opcion " + opciones.size());
            opcion = scanner.nextInt();
        }while(opcion < 1 || opcion > opciones.size());

        scanner.close();
        return opcion;
    }



}
