package restassured.interview.stringexamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        // Common Methods: add(e), get(index), set(index, e), remove(index), size(), isEmpty(), contains(o).
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        // Create another list of integers to add
        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);

        // Add all elements from list2 to the end of list1
        list1.addAll(0,list2);

        // Print the modified list1
        // Output: [1, 2, 3, 4, 5]
        System.out.println(list1);


        List<String> list = new ArrayList<String>();
        list.add("Dhanbad");
        list.add(0, "New York");
        list.add("Mumbai");
        list.add(2, "Sydney");
        System.out.println(list);


        //list.set(0,"Mallika"); replace
       // list.get(0); get
       // list.clear(); clear all items
        //list.remove(0); clear at index
        //list.size();
        //list.isEmpty();
        //list.contains(o);


        List<Integer> listRev = new ArrayList<>();
        listRev.add(20);
        listRev.add(10);
        listRev.add(5);
        listRev.add(30);
        System.out.println("Original list: " +listRev); // 20, 10, 5, 30
        Collections.reverse(listRev);
        System.out.println("Reversed list: " +listRev); // 30, 5, 10, 20

    }
}
