public class ejemplofunciones {
    public static void main (String args[]){
String nombre = "Pepe"; //Pepe
System.out.println(nombre);
String apellidos = "Martínez García"; //Martínez García
System.out.println (apellidos);
String nombreCompleto = nombre + apellidos; //PepeMartínez García
System.out.println (nombreCompleto);
int longitud = nombre.length(); //4
System.out.println (longitud);
int longitud2 = "245".length(); //3
System.out.println (longitud2);
char letra = apellidos.charAt(3); //t
System.out.println (letra);
String cadena1 = nombreCompleto.substring(0,4); //Pepe
System.out.println (cadena1);
String cadena2 = " Hola ".trim(); //Hola
System.out.println (cadena2);
String cadena3_1 = cadena1.substring(3,4); //e
System.out.println (cadena3_1);
String cadena3_2 = cadena1.substring(3,3); //
System.out.println (cadena3_2);
String cadena3_3 = cadena1.substring(4,3); //ERROR
System.out.println (cadena3_3);
String cadena4 = (cadena2 + "Hola").toLowerCase(); //holahola
System.out.println (cadena4);
int posicion1 = cadena4.indexOf("o"); //1
System.out.println (posicion1);
int posicion2 = cadena4.indexOf("hola"); //0
System.out.println (posicion2);
int posicion3 = cadena4.indexOf("Hola"); //-1
System.out.println (posicion3);
    }
    
}