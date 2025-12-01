package restassured.interview.stringexamples;

import java.util.*;
import java.lang.*;

class RemoveDuplicateNumbers
{
    public static void main (String[] args) throws java.lang.Exception
    {
        List<Integer> intList1 = new ArrayList<>();
        List<Integer> intList2 = new ArrayList<>();
        intList1.add(1);
        intList1.add(2);
        intList1.add(3);

        intList1.add(3);
        intList1.add(4);
        intList1.add(5);
        intList1.addAll(intList2);
        System.out.println(intList1);
        Set<Integer> set = new LinkedHashSet<>(intList1);
        System.out.println(set);


        // Initialize a List of Integers
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        numbers1.add(9);
        System.out.println("Numbers1: " + numbers1);
        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(1, 4, 8, 4, 6));
        numbers2.add(8);
        System.out.println("Numbers2: " + numbers2);
        System.out.println(numbers1.addAll(numbers2));
        Set<Integer> set2 = new TreeSet<>(numbers1);
        System.out.println(set2);

    }
}

//ok