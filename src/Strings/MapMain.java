package Strings;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("1234567656L", "Nombre Apellido 1");
        map.put("1234567655H", "Nombre Apellido 2");
        map.put("1234567657M", "Nombre Apellido 3");
        map.put("1234567659O", "Nombre Apellido 4");

        System.out.println(map);

        for(String value : map.values()){
            System.out.println(value);
        }

        for (Map.Entry<String, String> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}
