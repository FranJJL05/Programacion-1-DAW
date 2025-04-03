package Ejercicio6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Supermercado {
    public static void main(String[] args) {
        HashMap<String, Double> productos = new HashMap<>();
        String producto;
        int cantidad;
        double total1 = 0;
        
        Scanner entrada = new Scanner(System.in);

        productos.put("avena", 2.21);
        productos.put("garbanzos", 2.39);
        productos.put("tomate", 1.59);
        productos.put("jengibre", 3.13);
        productos.put("quinoa", 4.50);
        productos.put("guisantes", 1.60);

        ArrayList<Compra> carro = new ArrayList<>();

        while (true) {
            System.out.println("Producto: ");
            producto = entrada.nextLine();

            if (producto.equalsIgnoreCase("fin")) {
                break;
            }

            if (productos.containsKey(producto)) {
                System.out.println("Cantidad: ");
                cantidad = entrada.nextInt();
                entrada.nextLine();     /*Limpiar el bufet del scanner, para que no me repita producto: dos veces */
                carro.add(new Compra(producto, cantidad));
            }
        }

        System.out.println("\n");
        System.out.printf("%-15s %-10s %-11s %-10s\n", "Producto", "Precio", "Cantidad", "Subtotal");
        System.out.println("-------------------------------------------------");
        
        for (Compra compra : carro) {
            String producto1 = compra.getProducto();
            double precio1 = productos.get(compra.getProducto());
            int cantidad1 = compra.getCantidad(); // Cambié a int, ya que es cantidad de productos
            double subtotal = precio1 * cantidad1;

            // Ahora ajustamos el formato para que todo esté alineado
            System.out.printf("%-15s %-14.2f %-9d %-9.2f\n", producto1, precio1, cantidad1, subtotal);
            total1 += subtotal;
        }

        System.out.println("-------------------------------------------------");
        System.out.printf("TOTAL: %.2f\n", total1);

        entrada.close();
    }
}
