package Relacion10.ejer2;

public class ProgramaArticulo2 {
    public static void main(String[] args) {
        Articulo[] arrayArticulo = new Articulo[3];
        arrayArticulo[0]= new Articulo("T001", "Teclado");
        arrayArticulo[1] = new Articulo("T002", "Mouse");
        arrayArticulo[2] = new Articulo("T003", "Monitor");

        arrayArticulo[0].setPrecioCompra(1.0);
        arrayArticulo[0].setPrecioVenta(2.0);
        arrayArticulo[0].setStock(100);

        arrayArticulo[1].setPrecioCompra(1.5);
        arrayArticulo[1].setPrecioVenta(2.30);
        arrayArticulo[1].setStock(50);

        arrayArticulo[2].setPrecioCompra(1.0);
        arrayArticulo[2].setPrecioVenta(2.5);
        arrayArticulo[2].setStock(30);

        for (Articulo articulo : arrayArticulo) {
            System.out.println(articulo);
        }

    }
}
