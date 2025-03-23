package Ejercicio3;

// Clase Libro
public class Libro extends Publicacion implements Prestable {
    private boolean prestado;

    public Libro(String isbn, String titulo, int año) {
        super(isbn, titulo, año);
        this.prestado = false;
    }

    public void presta() {
        if (!prestado) {
            prestado = true;
            System.out.println("El libro '" + titulo + "' ha sido prestado.");
        } else {
            System.out.println("El libro '" + titulo + "' ya está prestado.");
        }
    }

    public void devuelve() {
        if (prestado) {
            prestado = false;
            System.out.println("El libro '" + titulo + "' ha sido devuelto.");
        } else {
            System.out.println("El libro '" + titulo + "' no estaba prestado.");
        }
    }

    public boolean estaPrestado() {
        return prestado;
    }

    @Override
    public String toString() {
        return super.toString() + ", Prestado: " + (prestado ? "Sí" : "No");
    }
}
