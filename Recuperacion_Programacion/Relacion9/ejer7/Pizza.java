package Relacion9.ejer7;

public class Pizza {
    private String tamaño;
    private String tipo;
    private String estado;
    private static int pedidas = 0;
    private static int servidas = 0;


    public Pizza(String tamaño, String tipo) {
        this.tamaño = tamaño;
        this.tipo = tipo;
        this.estado = "pedida";
        this.pedidas++;
    }

    public void sirve(){
        if (estado.equals("pedida")) {
            estado = "servida";
            System.out.println("La pizza está servida");
            servidas = servidas++;
            System.out.println("El total de pizzas servidas es de " + servidas);
        }else{
            System.out.println("La pizza ya se ha servido");
        }
    }

    public static int getTotalPedidas() {
        return pedidas;
    }

    public void setTotalPedidas(int totalPedidas) {
        this.pedidas = totalPedidas;
    }

    public static int getTotalServidas() {
        return servidas;
    }

    public void setTotalServidas(int totalServidas) {
        this.servidas = totalServidas;
    }

    @Override
    public String toString() {
        return "Pizza " + this.tipo + " tamaño " + this.tamaño + " " + this.estado;
    }
}
