package Ejercicio7;

public class Compra {

    Productos producto;
    int cantidad;

    public Compra(Productos producto, int cantidad){
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Productos getProducto() {
        return producto;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }
}
