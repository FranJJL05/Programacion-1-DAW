public class bicicleta {
    public String color;
    public int velocidad;
    public int marcha;

    public bicicleta(String color, int marcha, int velocidad) {
        this.color = color;
        this.marcha = marcha;
        this.velocidad = velocidad;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public int getMarcha() {
        return marcha;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    /*Métodos */
    public void avanzar(){
        System.out.println("La bicicleta está avanzando");
    }

    public void cambiarMarcha(){
        System.out.println("Cambiando la marcha");
    }

    public void frenar(){
        System.out.println("Está frenando");
    }
}
