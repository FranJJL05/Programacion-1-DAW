package Relacion10.ejer2;

public class Articulo{
    private String codigo;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int stock;

    
    public Articulo(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }


    public String getCodigo() {
        return codigo;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public double getPrecioCompra() {
        return precioCompra;
    }


    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }


    public double getPrecioVenta() {
        return precioVenta;
    }


    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }


    public int getStock() {
        return stock;
    }


    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Código del artículo: " + codigo + " Descripción del artículo: " + descripcion;
    }

}