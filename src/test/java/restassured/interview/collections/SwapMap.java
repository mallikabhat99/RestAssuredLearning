package restassured.interview.collections;
import java.util.HashMap;
import java.util.Map;

public class SwapMap {
    public static void main(String[] args) {
        // Original Map: Key is Integer, Value is String
        Map<Integer, String> originalMap = new HashMap<>();
        originalMap.put(1, "one");
        originalMap.put(2, "two");
        originalMap.put(3, "three");

        System.out.println("Original map: " + originalMap);

        // New Map: Key is String, Value is Integer
        Map<String, Integer> swappedMap = new HashMap<>();

        // Iterate and swap
        for (Map.Entry<Integer, String> entry : originalMap.entrySet()) {
            swappedMap.put(entry.getValue(), entry.getKey());
        }
        System.out.println("Swapped map: " + swappedMap);
    }
}