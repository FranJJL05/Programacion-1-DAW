public class Coche extends Vehiculo {
    public Coche(int kilometrosRecorridos) {
        super(kilometrosRecorridos);
    }

    public void anda() {
        System.out.println("Conduciendo el coche...");
    }

    public void quemaRueda() {
        System.out.println("¡Quemando rueda con el coche!");
    }
}
