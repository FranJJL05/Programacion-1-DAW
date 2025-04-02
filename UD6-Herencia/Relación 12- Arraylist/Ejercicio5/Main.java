package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(TipoComida.PIZZA);
        pedido1.agregarIngredientes("Pepperoni");
        pedido1.agregarIngredientes("Champiñones");
        pedido1.mostrarPedidos();

        Pedido pedido2 = new Pedido(TipoComida.HAMBURGUESA);
        pedido2.agregarIngredientes("Queso");
        pedido2.mostrarPedidos();

        Pedido pedido3 = new Pedido(TipoComida.ENSALADA);
        pedido3.mostrarPedidos();

        Pedido pedido4 = new Pedido(TipoComida.PASTA);
        pedido4.agregarIngredientes("Pepperoni");
        pedido4.mostrarPedidos();

        System.out.println("Número total de pedidos realizados: " + Pedido.getNumeroPedidos());
    }
}
