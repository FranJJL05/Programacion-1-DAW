package ejer11;

public class Piramide {
    private int altura;
    private static int piramidesCreadas = 0;

    public Piramide(int altura){
        this.altura = altura;
        piramidesCreadas++;
    }

    public static int getPiramidesCreadas() {
        return piramidesCreadas;
    }

    @Override
    public String toString(){
        String cadena = "";

        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.altura -i -1; j++) {
                cadena += " "; 
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                cadena += "*";
            }
            
            cadena += "\n";
        }

        return cadena;
    }
}
