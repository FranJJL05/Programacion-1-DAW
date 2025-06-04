package ejer11;

public class Rectangulo {
    private int base;
    private int altura;
    private static int rectangulosCreados = 0;

    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
        rectangulosCreados++;
    }

    public static int getRectangulosCreados() {
        return rectangulosCreados;
    }

    @Override
    public String toString() {
        String cadena ="";

        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base; j++) {
                cadena += "*";
            }
    
            cadena += "\n";
        }
        return cadena;
    }
}
      