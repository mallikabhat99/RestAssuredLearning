package restassured.interview.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExampleFilter {
    public static void main(String[] args)
    {
        //Filtering: Given a list of elements, filter out elements based on a specific condition
        // (e.g., even numbers, strings starting with a particular letter)
        //filter result will be lesser elements than actual list

        List<String> names = Arrays.asList("Jahn", "Peter", "Jane", "Pob");
        List<String> filteredNames = names.stream()
                .filter(name->name.startsWith("P"))  //.map .sorted
                .collect(Collectors.toList()); //reduce //forEach
        System.out.println(filteredNames);


        List<String> filterContains = names.stream()
                .filter(name->name.contains("Ja"))
                .collect(Collectors.toList());
        System.out.println(filterContains);


        List<String> filterEnds = names.stream()
                .filter(name->name.endsWith("e"))
                .collect(Collectors.toList());
        System.out.println(filterEnds);


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        List<Integer> oddNumbers = numbers.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);
        System.out.println(oddNumbers);

    }
}
