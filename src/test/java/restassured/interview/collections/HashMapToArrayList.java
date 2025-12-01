package restassured.interview.collections;
import java.util.*;
import java.util.stream.Collectors;

public class HashMapToArrayList {

    public static void main(String[] args) {
        HashMap<String, Integer> myHashMap = new HashMap<>();
        myHashMap.put("Apple", 2);
        myHashMap.put("Cherry", 1);
        myHashMap.put("Banana", 3);

        ArrayList<String> keyList = new ArrayList<>(myHashMap.keySet());
        Collections.sort(keyList,Collections.reverseOrder());
        System.out.println(keyList);

        ArrayList<Integer> valueList = new ArrayList<>(myHashMap.values());
        List<Integer> sorted = valueList.stream().sorted().collect(Collectors.toList());
        List<Integer> sortedUlta = valueList.stream()
                .sorted(Collections.reverseOrder()).collect(Collectors.toList());

        System.out.println(sorted);
        System.out.println(sortedUlta);

    }
}
//ok