package Relacion12.ejer2;

import java.util.ArrayList;

public class AlmArticulo{
    private ArrayList <Articulo> lista = new ArrayList<>();
    private static int totalArticulos = 0;
    
    public void almacena(Articulo articulo){
        lista.add(articulo);
        totalArticulos ++;
    }

    public static int getTotalArticulos() {
        return totalArticulos;
    }

    @Override
    public String toString() {
        String resultado = " ";
        for (Articulo articulo : lista) {
            resultado += articulo.toString() + "\n";
        }

        return resultado;
    }
}