package restassured.interview.collections;
import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // Adding elements to object
        // using add() method
        list.add("Shoes");
        list.add("Toys");
        list.add("Horse");
        list.add("Ball");
        list.add("Grapes");

        // Sort the List
        Collections.sort(list);
        System.out.println(list);

        // BinarySearch on the List
        System.out.println(
                "The index of Horse is: "
                        + Collections.binarySearch(list, "Horse"));
        // BinarySearch on the List
        System.out.println(
                "The index of Dog is: "
                        + Collections.binarySearch(list, "Dog"));
    }
}