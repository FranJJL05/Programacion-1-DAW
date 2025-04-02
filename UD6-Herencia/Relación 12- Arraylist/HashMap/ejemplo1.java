package HashMap;

import java.util.HashMap;

public class ejemplo1 {
    public static void main(String[] args) {
        HashMap<String, Integer> edades = new HashMap<String, Integer>();
        Integer edad;

        edades.put("Elon", 21);
        edades.put("Jeff", 22);
        edades.put("Bill", 48);
        edades.put("Warren", null);
        
        /*Para acceder a solo una de ellas*/
        edad = edades.get("Elon");
        System.out.println("La edad de Elon es: " + edad);

        /*Para recorrer todas las claves y te muestre el valor de cada una, es un acceso recorriendo el diccionario */
        for (String clave: edades.keySet())
        {
           Integer valor = edades.get(clave);
           System.out.println(clave + " --> " + valor);
        }   
    }
}

/*ctrl + d para modificar un comando en varias lineas a la misma vez
 * ctrl + alt + flechas para seleccionar lineas y modificar lo mismo que haya en esas lineas 
 */
