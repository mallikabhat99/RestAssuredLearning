package restassured.interview.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExampleMap {
    public static void main(String[] args)
    {
       //Mapping: Transform elements from one type to another
        // (e.g., convert a list of strings to uppercase, square a list of integers).
        //map result siz equal to actual list

        List<String> namesMap = Arrays.asList("aLice", "bOb", "chArlie");
        List<String> upperCaseNames = namesMap.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperCaseNames);

        List<String> lowerCaseNames =namesMap.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println(lowerCaseNames);

        List<Integer> num = Arrays.asList(5,4,3,2,11);
        List<Integer> sqaure =num.stream()
                .map(n-> n*n)
                .collect(Collectors.toList());
        System.out.println(sqaure);
    }
}
