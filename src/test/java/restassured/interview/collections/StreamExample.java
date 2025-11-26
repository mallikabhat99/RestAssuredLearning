package restassured.interview.collections;
import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args)
    {

//Reducing: Aggregate elements into a single result (e.g., find the sum, product, maximum, or minimum of elements).
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
        int sum = num.stream().reduce(0, Integer::sum);
        System.out.println(sum);


//Collecting: Gather elements into various data structures (e.g., list, set, map).
        List<String> words = Arrays.asList("apple", "banana", "apricot", "grape");
        Map<Character, List<String>> groupedByFirstLetter = words.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));
        System.out.println(groupedByFirstLetter);


        //Sorting: Sort elements based on various criteria (e.g., natural order, custom comparators).

        List<String> fruits = Arrays.asList("orange", "apple", "banana");
        List<String> sortedFruits = fruits.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedFruits);

    }
}
