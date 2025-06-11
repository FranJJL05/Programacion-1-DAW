package Relacion9.ejer9;

public class Tiempo {
    private int horas, minutos, segundos;


    public Tiempo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    void Normalizar() {
        while (segundos >= 60) {
            segundos -= 60;
            minutos++;
        }
        while (minutos >= 60) {
            minutos -= 60;
            horas++;
        }
    }

    public Tiempo suma(Tiempo otro){
        int TotalSegundos = this.segundos + otro.segundos;
        int TotalHoras = this.horas + otro.horas;
        int TotalMinutos = this.minutos + otro.minutos;

        Tiempo resultado = new Tiempo(0, 0, TotalSegundos);
        resultado.minutos += TotalMinutos;
        resultado.horas += TotalHoras;
        resultado.Normalizar();

        return resultado;
    }

    public Tiempo resta(Tiempo otro) {
        int TotalSegundo = this.segundos - otro.segundos;
        int TotalMinutos = this.minutos - otro.minutos;
        int TotalHoras = this.horas - otro.horas;

        if (TotalSegundo < 0) {
            TotalSegundo += 60;
            TotalMinutos--;
        }

        if (TotalMinutos < 0) {
            TotalMinutos += 60;
            TotalHoras--;
        }

        Tiempo resultado = new Tiempo(0, 0, TotalSegundo);
        resultado.minutos += TotalMinutos;
        resultado.horas += TotalHoras;
        resultado.Normalizar();

        return resultado;
    }

    @Override
    public String toString(){
        return horas + "h " + minutos + "m " + segundos + "s";
    }
}
