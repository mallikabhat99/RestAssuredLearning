package restassured.interview.collections;

import java.util.*;

public class ListIteratorExample {
    public static void main(String[] args)
    {
        // list of names
        List<String> names = new LinkedList<>();
        names.add("learn");
        names.add("from");
        names.add("Geeksforgeeks");

        // Getting ListIterator
        ListIterator<String> listIterator = names.listIterator();

        // Traversing elements
        System.out.println("Forward Direction Iteration:");

        while (listIterator.hasNext()) {
            String element = listIterator.next();
            System.out.println(element);
            if(element.equals("from"))
                listIterator.remove();
        }

        // Traversing elements, the iterator is at the end at this point
        System.out.println("Backward Direction Iteration:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());


        }
    }
}