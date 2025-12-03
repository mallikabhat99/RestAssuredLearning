package restassured.interview.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExampleReduce {
    public static void main(String[] args)
    {

//Reducing:
// Aggregate elements into a single result
// (e.g., find the sum, product, maximum, or minimum of elements). concat strings
        List<Integer> num = Arrays.asList(7, 2, 3, 4, 5);
        int sum = num.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        int max = num.stream().reduce(1,Integer::max);
        System.out.println(max);

        int min = num.stream().reduce(5,Integer::min);
        System.out.println(min);

        int product = num.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println("The product of the numbers is: " + product); //

        List<String> namesMap = Arrays.asList("aLice", "bOb", "chArlie");
        String concat = namesMap.stream()
                .reduce(" ", (str1,str2)->(str1+" "+str2));
        System.out.println(concat);

    }
}
