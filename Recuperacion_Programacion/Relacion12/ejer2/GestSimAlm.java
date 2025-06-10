package Relacion12.ejer2;

import java.util.ArrayList;

public class GestSimAlm {
    private ArrayList<Articulo> almacen = new ArrayList<>();

    public void entradaAutomatizada() {
        almacen.add(new Articulo("123", "Teclado"));
        almacen.add(new Articulo("456", "Raton"));
        almacen.add(new Articulo("789", "Monitor"));
        almacen.add(new Articulo("012", "Cargador"));
    }

    public void lista() {
        for (Articulo articulo : almacen) {
            System.out.println(articulo);
        }
    }

    public void alta(Articulo articulo) {
        almacen.add(articulo);
    }

    public void baja(String codigo) {
        for (int i = 0; i < almacen.size(); i++) {
            if (almacen.get(i).getCodigo().equals(codigo)) {
                almacen.remove(i);
                return;
            }
        }
    }

    public void entradaMercancia(String codigo, int cantidad) {
        for (Articulo articulo : almacen) {
            if (articulo.getCodigo().equals(codigo)) {
                articulo.setStock(articulo.getStock() + cantidad);
                return;
            }
        }
    }

    public void salidaMercancia(String codigo, int cantidad) {
        for (Articulo articulo : almacen) {
            if (articulo.getCodigo().equals(codigo)) {
                if (articulo.getStock() >= cantidad) {
                    articulo.setStock(articulo.getStock() - cantidad);
                } else {
                    System.out.println("No hay suficiente stock");
                }
                return;
            }
        }
    }
}