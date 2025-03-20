public class Articulo {
    private String codigo;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int stock;
    
    public Articulo(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCompra = 0.0;
        this.precioVenta = 0.0;
        this.stock = 0;
    }

    public void getCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String setCodigo() {
        return codigo;
    }

    public void getDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String setDescripcion() {
        return descripcion;
    }

    public void getPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double setPrecioCompra() {
        return precioCompra;
    }

    public void getPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double setPrecioVenta() {
        return precioVenta;
    }

    public void getStock(int stock) {
        this.stock = stock;
    }

    public int setStock() {
        return stock;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Descripción: " + descripcion +
               ", Precio Compra: " + precioCompra + ", Precio Venta: " + precioVenta +
               ", Stock: " + stock;
    }
}
