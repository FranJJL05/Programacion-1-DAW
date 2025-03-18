import java.util.ArrayList;

public class GetSimAlm{
    private ArrayList<Articulo> almacén;

    public GetSimAlm() {
        almacén = new ArrayList<>();
    }

    public void entradaAutomatizada(){
        almacén.add(new Articulo("A001", "Articulo 1", 20.0, 30.0, 100));
        almacén.add(new Articulo("A002", "Articulo 2", 15.0, 25.0, 50));
        almacén.add(new Articulo("A003", "Articulo 3", 5.0, 10.0, 200));
        almacén.add(new Articulo("A004", "Articulo 4", 30.0, 50.0, 30));
    }

    public void lista(){
        if (almacén	.isEmpty()) {
            System.out.println("No hay articulos en el almacén");
        } else {
            for (Articulo articulo : almacén) {
                System.out.println(articulo);
            }
        }
    }

    public void alta(String codigo, String descripcion, double precioCompra, double precioVenta, int stock){
        almacén.add(new Articulo(codigo, descripcion, precioCompra, precioVenta, stock));
        System.out.println("Artículo"+ descripcion + " dado de alta");
    }

    public void baja(String codigo){
        Articulo articuloABaja = buscarArticulo(codigo);
        if (articuloABaja != null) {
            almacén.remove(articuloABaja);
            System.out.println("Artículo"+ articuloABaja + " dado de baja");
        } else {
            System.out.println("Artículo no encontrado");
        }
    }
    
}
