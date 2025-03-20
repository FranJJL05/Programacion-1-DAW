import java.util.ArrayList;

public class GestSimAlm {
    private ArrayList<Articulo> almacen;

    public GestSimAlm() {
        almacen = new ArrayList<>();
    }

    public void entradaAutomatizada() {
        almacen.add(new Articulo("A001", "Laptop"));
        almacen.add(new Articulo("A002", "Teclado"));
        almacen.add(new Articulo("A003", "Ratón"));
        almacen.add(new Articulo("A004", "Monitor"));
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
                    System.out.println("No hay suficiente stock para la salida.");
                }
                return;
            }
        }
    }
}