package restassured.interview.stringexamples;

import java.util.*;

public class SetBasics {
    public static void main(String[] args) {
        //unorderd , doesnt allow duplicates
        //Common Methods: add(e), remove(o), contains(o), size(), isEmpty().
        List<String> aList = Arrays.asList("apple", "banana", "apple", "orange");
        Set<String> hSet = new HashSet<>(aList);
        System.out.println(hSet);


        // Creating an empty Set.
        Set<String> set = new HashSet<>();
  // Call add() method to add elements into the Set.
        set.add("Banana");
        set.add("Orange");
        set.add("Apple");
        set.remove("Banana");
        set.remove("Orange");

        // Printing the size of the Set.
        System.out.println("The size of set is: " + set.size());
        set.clear();
        System.out.println("Is set empty " + set.isEmpty());




        Set<String> fruits = new HashSet<>();

        // Add elements to the Set
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Check if the Set contains "Banana"
        boolean hasBanana = fruits.contains("Banana");
        System.out.println("Does the set contain \"Banana\"? " + hasBanana); // Output: true

        // Check if the Set contains "Grape"
        boolean hasGrape = fruits.contains("Grape");
        System.out.println("Does the set contain \"Grape\"? " + hasGrape);



    }
}
