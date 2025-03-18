public class Bicicleta extends Vehiculo{
    public Bicicleta(int kilometrosRecorridos) {
        super(kilometrosRecorridos);
    }

    public void anda() {
        System.out.println("Andando en bicicleta...");
    }

    public void hazCaballito() {
        System.out.println("¡Haciendo el caballito con la bicicleta!");
    }
}
