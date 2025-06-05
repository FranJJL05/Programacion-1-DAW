package Relacion10.ejer5_y_ejer6;

public class Prestamos {
    private String fechaPrestamo;
    private String fechaDevolucuion;
    Libro libroPrestado;
    private String cliente;
    private static int totalPrestados = 0;


    public Prestamos(String fechaPrestamo, String fechaDevolucuion, Libro libroPrestado, String cliente) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucuion = fechaDevolucuion;
        this.libroPrestado = libroPrestado;
        this.cliente = cliente;
        totalPrestados ++;
    }

    public static int getTotalPrestados() {
        return totalPrestados;
    }

    @Override
    public String toString() {
        return "Fecha Prestamo: " + fechaPrestamo + "\nFecha Devolucion: " + fechaDevolucuion + "\nLibro Prestado: " + libroPrestado + "\nCliente: " + cliente;
    }

}
