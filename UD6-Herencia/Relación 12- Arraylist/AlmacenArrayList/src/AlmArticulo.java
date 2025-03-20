import java.util.ArrayList;
public class AlmArticulo {
    private ArrayList<Articulo> articulos;

    public AlmArticulo() {
        this.articulos = new ArrayList<>();
    }

    public void almacena(Articulo articulo) {
        articulos.add(articulo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Articulo articulo : articulos) {
            sb.append(articulo.toString()).append("\n");
        }
        return sb.toString();
    }
}