package ejer7;

public class Pizza {
    private String tamaño;
    private String tipo;
    private String estado = "pedida";
    private int totalPedidas = 0;
    private int totalServidas = 0;


    public Pizza(String tamaño, String tipo) {
        this.tamaño = tamaño;
        this.tipo = tipo;
        this.totalPedidas++;
    }

    public void sirve(){
        if (estado.equals("pedida")) {
            estado = "servida";
            System.out.println("La pizza está servida");
            totalServidas = totalServidas++;
            System.out.println("El total de pizzas servidas es de " + totalServidas       );
        }else{
            System.out.println("La pizza ya se ha servido");
        }
    }

    public int getTotalPedidas() {
        return totalPedidas;
    }

    public void setTotalPedidas(int totalPedidas) {
        this.totalPedidas = totalPedidas;
    }

    public int getTotalServidas() {
        return totalServidas;
    }

    public void setTotalServidas(int totalServidas) {
        this.totalServidas = totalServidas;
    }

}
