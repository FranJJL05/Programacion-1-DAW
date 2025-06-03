public class autobus {
    private String matricula;
    private String modelo;
    private int potenciaCV;
    private int numeroPlazas;

    public autobus(String matricula, String modelo, int potenciaCV, int numeroPlazas){
        this.matricula = matricula;
        this.modelo = modelo;
        this.potenciaCV = potenciaCV;
        this.numeroPlazas = numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }
}
