package restassured.stringexamples;

import java.util.HashMap;
import java.util.Map;

public class MapBasics {
    public static void main(String[] args) {
        //Common Methods: put(key, value), get(key), remove(key), containsKey(key), containsValue(value), keySet(), values(), entrySet().
        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Red");
        map.put(103, "Green");
        map.put(102, "Yellow");

        Map<Integer,String> map2 = new HashMap<>();
        map2.put(115, "Brown");
        map2.put(120, "Purple");
        map.putAll(map2);
        System.out.println(map);




        Map<String, String> mapA = new HashMap<>();
        mapA.put("A", "Apple");
        mapA.put("B", "Boy");
        mapA.put("C", "Cat");
        mapA.replace("C", "Element");
        mapA.remove("A","Apple");
        System.out.println(map);



        Map<String, String> mapC = new HashMap<>();
        mapC.put("V", "Violet");
        mapC.put("I", "Indigo");
        mapC.put("B", "Blue");
        mapC.put("G", "Green");
        mapC.put("Y", "Yellow");

        String value = mapC.get("B");
        System.out.println(value);
        boolean entryKey = mapC.containsKey("B");
        System.out.println(entryKey);
        boolean entryValue = mapC.containsValue("Brown");
        System.out.println(entryValue);

        System.out.println(mapC.keySet() + "Keyset");
        System.out.println(mapC.entrySet()+"All K=V");
        System.out.println(mapC.values()+"values");





    }

}
