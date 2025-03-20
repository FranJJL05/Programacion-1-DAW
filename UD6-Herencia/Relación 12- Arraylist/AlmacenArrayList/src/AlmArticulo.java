import java.util.ArrayList;

public class AlmArticulo {
    private ArrayList<Articulo> almacen;

    public AlmArticulo() {
        this.almacen = new ArrayList<>();
    }

    public void almacena(Articulo articulo) {
        almacen.add(articulo);
    }

    //Sobrecarga del método toString para imprimir todos los articulos
    @Override
    public String toString() {
        String resultado = "";
        for (Articulo articulo : almacen) {
            resultado += articulo + "\n";
        }
        return resultado;
    }
}
