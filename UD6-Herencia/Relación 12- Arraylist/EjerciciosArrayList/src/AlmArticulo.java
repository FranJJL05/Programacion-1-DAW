import java.util.ArrayList;

public class AlmArticulo {
    private ArrayList<Articulo> articulos;

    public AlmArticulo() {
        articulos = new ArrayList<>();
    }

    public void almacena(Articulo articulo) {
        articulos.add(articulo);
    }

    //Sobrecarga del método toString para imprimir todos los articulos
    @Override
    public String toString() {
        String resultado = "";
        for (Articulo articulo : articulos) {
            resultado += articulo + "\n";
        }
        return resultado;
    }
}
