package Ultimo_examen.Vehiculo;

public abstract class Vehiculo {
    protected String matricula;
    protected String marca;
    protected String modelo;
    protected long kmRecorridos = 0;
    protected boolean alquilado = false;
    protected static int totalVehiculos;

    /*Constructor */
    public Vehiculo(String matricula, String marca, String modelo, long kmRecorridos){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.kmRecorridos = kmRecorridos;
        totalVehiculos ++;
    }

    /*Métodos */
    public long getKmRecorridos() {
        return kmRecorridos;
    }

    public String getMarca() {
        return marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public static int getTotalVehiculos() {
        return totalVehiculos;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    public void setKmRecorridos(long kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public static void setTotalVehiculos(int totalVehiculos) {
        Vehiculo.totalVehiculos = totalVehiculos;
    }


    public void alquilar(){
        if (!alquilado) {
            System.out.println("El vehículo ha sido alquilado");
            alquilado = true;
        }else{
            System.out.println("El vehículo ya está alquilado");
        }
    }    
    
    public abstract void devolver();

    public boolean estaAlquilado( ){
        return alquilado;   
    }


    @Override
    public String toString() {
        return "Matricula: " + matricula + " Marca: " + marca + " Modelo: " + modelo + " KMRecorridos: " + kmRecorridos;
    }

}

