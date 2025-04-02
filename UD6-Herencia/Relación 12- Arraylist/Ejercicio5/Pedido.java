package Ejercicio5;

import java.util.HashSet;

public class Pedido {
    static int numPedido;
    TipoComida tipoComida;

    HashSet<String> ingredientes = new HashSet<>();

    public Pedido(TipoComida tipoComida){
        this.tipoComida = tipoComida;
        numPedido ++;
    }

    public void agregarIngredientes(String ingrediente){
        ingredientes.add(ingrediente);
    }

    public void mostrarPedidos(){
        System.out.println(toString());
    }

    public static int getNumeroPedidos(){
        return numPedido;
    }

    @Override
    public String toString(){
        return "Pedido: " + tipoComida + "\nIngredientes extras: " + numPedido + "\nIngredientes extras: " + (ingredientes.isEmpty() ? "Ninguno" :ingredientes);
    }
}
