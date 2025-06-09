package Relacion11.ejer7_y_ejer9;

public class Bicicleta extends Vehiculo {

    public Bicicleta(int kilometrosRecorridos) {
        super(kilometrosRecorridos);
    }
    
    public void anda(){
        System.out.println("La bicicleta está andando");
    }

    public void hazCaballito(){
        System.out.println("Haciendo el caballito con la bicicleta");
    }

}
