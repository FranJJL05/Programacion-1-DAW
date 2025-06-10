package Relacion10.ejer3;

import Relacion10.ejer2.Articulo;

public class PruebaArticulo {
    
    int tamaño;
    Articulo[] articulos;

    public PruebaArticulo(int tamaño){
        articulos = new Articulo[tamaño];
    }

    public boolean almacena(Articulo articulo1){
        for (int i = 0; i < articulos.length; i++) {
            if (articulos[i] == null) {
                articulos[i] = articulo1;
                return true;
            }
        }
        return false;
    }

    public Articulo[] getArticulos() {
        return articulos;
    }

    public void setArticulos(Articulo[] articulos) {
        this.articulos = articulos;
    }


    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < articulos.length; i++) {
            if (articulos[i] != null) {
                result += "Articulo " + (i + 1) + ":\n" +
                            articulos[i].toString() + ":\n" +
                            "--------------------------\n";
            }
        }
        return result;
    }
}
