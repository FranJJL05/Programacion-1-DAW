package HashMap;

import java.util.HashMap;

public class ejemplo1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Elon", 21);
        map.put("Jeff", 22);
        map.put("Bill", 48);
        map.put("Warren", null);
        
        for (String key: map.keySet())
        {
           Integer value = map.get(key);
           System.out.println(key + " --> " + value);
        }   
    }
}
