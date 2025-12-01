package restassured.interview.collections;
import java.util.*;
import java.util.stream.Collectors;

public class StreamExampleSorting {
    public static void main(String[] args)
    {
        //Sorting: Sort elements based on various criteria (e.g., natural order, custom comparators).

//sorted() is an intermediate operation, meaning it returns another Stream and can be chained with other stream operations.
//It is a stateful operation because it needs to collect all elements to perform the sorting before emitting them.
//To get the sorted elements back into a collection (like a List),
// a terminal operation such as collect(Collectors.toList()) is required.


        List<String> fruits = Arrays.asList("orange", "apple", "banana");
        List<String> sortedFruits = fruits.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedFruits);

        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9);
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .filter(n -> n % 2 == 0)
                .map(n-> n*n)
                .collect(Collectors.toList());
        System.out.println(sortedNumbers);

        List<String> names = Arrays.asList("Alice", "Charlie", "Bob");
        List<String> sortedNamesDesc = names.stream()
                .sorted(Comparator.reverseOrder()) // Sorts in descending order
                        .collect(Collectors.toList());
        System.out.println(sortedNamesDesc);


    }
}
