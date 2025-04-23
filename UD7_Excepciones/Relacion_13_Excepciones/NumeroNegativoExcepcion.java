package UD7_Excepciones.Relacion_13_Excepciones;

// Ejercicio 5
public class NumeroNegativoExcepcion extends Exception{
    public NumeroNegativoExcepcion(){
        super();
    }

    public NumeroNegativoExcepcion(String parametro){
        super(parametro);
    }
}
