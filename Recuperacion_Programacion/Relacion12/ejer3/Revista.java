package Relacion12.ejer3;

public class Revista extends Publicacion {
    private int numero;

    public Revista(String isbn, String titulo, int año, int numero) {
        super(isbn, titulo, año);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return super.toString() + ", Número: " + numero;
    }
}
