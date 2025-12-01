package restassured.interview.collections;

import java.io.*;
import java.util.*;

class IterateUsingforEach {
    public static void main(String[] args)
    {
        // create a list
        List<String> list = new ArrayList<>();

        // add elements to the list
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
        list.forEach((element)->{
            System.out.println(element);
        });
    }
}