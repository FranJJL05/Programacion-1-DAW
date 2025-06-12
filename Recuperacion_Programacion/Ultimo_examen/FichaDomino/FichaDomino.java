package Ultimo_examen.FichaDomino;

public class FichaDomino {
    private int lado1;
    private int lado2;

    public FichaDomino(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public boolean encaja(FichaDomino otraFicha) {
        if (lado1 == otraFicha.lado1 || lado1 == otraFicha.lado2 || lado2 == otraFicha.lado1 || lado2 == otraFicha.lado2) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        String l1;
        String l2;

        if (lado1 == 0) {
            l1 = " ";
        } else {
            l1 = String.valueOf(lado1);
        }

        if (lado2 == 0) {
            l2 = " ";
        } else {
            l2 = String.valueOf(lado2);
        }

        return "[" + l1 + "|" + l2 + "]";
    }
}
