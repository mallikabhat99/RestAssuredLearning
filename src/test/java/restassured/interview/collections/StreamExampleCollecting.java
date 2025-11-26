package restassured.interview.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
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
    }

}
