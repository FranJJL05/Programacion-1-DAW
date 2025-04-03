package Ejercicio6;

public class Compra {
    // atributos de instancia
    String producto;
    int cantidad;

    // constructor
    public Compra(String producto, int cantidad){
        this.producto = producto;
        this.cantidad = cantidad;
    }

    // métodos get y set
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }
}
