package restassured.interview.collections;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExampleCollecting {
    public static void main(String[] args)
    {

     //Collecting: Gather elements into various data structures (e.g., list, set, map).
        List<String> words = Arrays.asList("apple", "banana", "apricot", "grape","grass");
        Map<Integer, List<String>> groupBySize = words.stream().sorted()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(groupBySize);

        Map<Character, List<String>> groupedByFirstLetter = words.stream()
                .sorted()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));
        System.out.println(groupedByFirstLetter);
        List<String> fruits = Arrays.asList("apple", "banana", "orange", "apple", "grape","banana");
        // Collect the stream elements into a Set
        Set<String> stringSet = fruits.stream().collect(Collectors.toSet());

        // Print the resulting set
        System.out.println(stringSet);
    }

}
