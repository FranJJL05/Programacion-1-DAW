package Ejercicio6;

import java.util.HashMap;
import java.util.Scanner;

public class Supermercado {
    public static void main(String[] args) {
        HashMap<String, Double> productos =  new HashMap<>();
        String producto;

        Scanner entrada = new Scanner(System.in);

        productos.put("avena",  2.21);
        productos.put("garbanzos",  2.39);
        productos.put("tomate",  1.59);
        productos.put("jengibre",  3.13);
        productos.put("quinoa",  4.50);
        productos.put("guisantes",  1.60);

        System.out.println("Producto: ");
        producto = entrada.nextLine();

        





    }
}
