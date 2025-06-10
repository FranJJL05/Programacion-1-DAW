package Relacion11.ejer4_y_ejer5;

public class ProgramaEmpleado {
    public static void main(String[] args) {
        Directivo D1 = new Directivo("Mario");
        Operario OP1 = new Operario("Alfonso");
        Oficial OF1 = new Oficial("Luis");
        Tecnico T1 = new Tecnico("Pablo");

        System.out.println(D1);
        System.out.println(OP1);
        System.out.println(OF1);
        System.out.println(T1);

        System.out.println(T1.salario());
    }
}
