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

    //metodo get  y set de codigo
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    //metodo get de codigo
    public String getCodigo() {
        return codigo;
    }

    //metodo get y set de descripcion
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    //metodo get de descripcion
    public String getDescripcion() {
        return descripcion;
    }
   
    //metodo get y set de precioCompra
    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }
    //metodo get de precioCompra
    public double getPrecioCompra() {
        return precioCompra;
    }

    //metodo get y set de precioVenta
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    //metodo get de precioVenta
    public double getPrecioVenta() {
        return precioVenta;
    }
    //metodo get y set de stock
    public void setStock(int stock) {
        this.stock = stock;
    }
    //metodo get de stock
    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Descripción: " + descripcion +
               ", Precio Compra: " + precioCompra + ", Precio Venta: " + precioVenta +
               ", Stock: " + stock;
    }
}
