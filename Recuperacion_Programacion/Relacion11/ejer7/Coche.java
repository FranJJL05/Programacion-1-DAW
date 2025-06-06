package  Relacion11.ejer7;

public class Coche extends Vehiculo{

    public Coche(int kilometrosRecorridos) {
        super(kilometrosRecorridos);
    }

    public void anda() {
        System.out.println("El coche está andando");
    }

    public void quemaRueda(){
        System.out.println("Quemando rueda con el coche");
    }

}