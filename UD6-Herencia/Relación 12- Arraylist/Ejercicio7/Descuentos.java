package Ejercicio7;


public enum Descuentos {
    ECODTO(0.10), // 10% de descuento
    SIN_DTO(0.0); // Sin descuento

    private final double valor;

    Descuentos(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}


