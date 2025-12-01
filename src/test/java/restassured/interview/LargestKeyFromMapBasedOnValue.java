package restassured.interview;

import java.util.*;

public class LargestKeyFromMapBasedOnValue {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Mallika", 15);
        map.put("Prasad", 18);
        map.put("Kumud", 13);

        TreeMap<String, Integer> tree = new TreeMap<>(map);
        System.out.println(tree);

        Integer valueToFind = 18;
        String keyFound = null;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(valueToFind)) {
                keyFound = entry.getKey();
                break; // Stop after finding the first match
            }
        }

        if (keyFound != null) {
            System.out.println("Key for value '" + valueToFind + "' is: " + keyFound);
        } else {
            System.out.println("Value '" + valueToFind + "' not found.");
        }

    }
    }
//ok