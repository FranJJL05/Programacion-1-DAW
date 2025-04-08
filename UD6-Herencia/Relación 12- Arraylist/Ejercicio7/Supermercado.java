package Ejercicio7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Supermercado {
    public static void main(String[] args) {
        HashMap<String, Double> productos = new HashMap<>();
        String producto;
        int cantidad;
        double total1 = 0;
        Descuentos descuento = Descuentos.SIN_DTO;
        Scanner entrada = new Scanner(System.in);

        // Definir productos y precios
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
                System.out.println("Introduce ECODTO si quieres aplicarle un 10% a la compra, sino pulsa enter");
                String codigo = entrada.nextLine();

                if (codigo.equalsIgnoreCase("ECODTO")) {
                    descuento = Descuentos.ECODTO;
                }

                break;
            }

            if (productos.containsKey(producto)) {
                System.out.println("Cantidad: ");
                cantidad = entrada.nextInt();
                entrada.nextLine(); // Limpiar el buffer

                boolean encontrado = false;

                // Verificar si el producto ya está en el carrito
                for (Compra compra : carro) {
                    if (compra.getProducto().equals(producto)) {
                        compra.setCantidad(compra.getCantidad() + cantidad); // Sumar cantidad
                        encontrado = true;
                        break;
                    }
                }

                // Si el producto no está en el carrito, añadirlo
                if (!encontrado) {
                    carro.add(new Compra(producto, cantidad));
                } else {
                    System.out.println("Producto no disponible.");
                }

            }
        }
        // Imprimir el resumen de compras
        System.out.println("\n");
        System.out.printf("%-15s %-10s %-11s %-10s\n", "Producto", "Precio", "Cantidad", "Subtotal");
        System.out.println("-------------------------------------------------");
        for (Compra compra : carro) {
            String producto1 = compra.getProducto();
            double precio1 = productos.get(compra.getProducto());
            int cantidad1 = compra.getCantidad();
            double subtotal = precio1 * cantidad1;

            // Mostrar los detalles del producto
            System.out.printf("%-15s %-14.2f %-9d %-9.2f\n", producto1, precio1, cantidad1, subtotal);
            total1 += subtotal;
        }

        if (descuento != Descuentos.SIN_DTO) {
            System.out.println("Descuento aplicado: " + (descuento.getValor() * 100) + "%");
        }

        total1 = total1 * (1 - descuento.getValor());

        System.out.println("-------------------------------------------------");
        System.out.printf("TOTAL: %.2f\n", total1);

        entrada.close();

    }
}
