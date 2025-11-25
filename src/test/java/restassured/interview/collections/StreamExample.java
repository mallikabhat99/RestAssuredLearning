package restassured.interview.collections;
import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("John", "Peter", "Jane", "Bob");

        List<String> filteredNames = names.stream().filter(name->name.startsWith("J")).collect(Collectors.toList());

        System.out.println(filteredNames);
    }
}
