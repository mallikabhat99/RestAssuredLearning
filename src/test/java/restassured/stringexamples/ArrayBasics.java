package restassured.stringexamples;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class ArrayBasics {
    public static void main(String[] args) {
        String[] myName = new String[2];
        myName[0] = "Mallika";
        myName[1] = "Bhat";
        String[] prasadName = {"Prasad","Kini"};

        System.out.println(Arrays.toString(myName));
        System.out.println(Arrays.toString(prasadName));
        System.out.println(Arrays.asList(myName));

        List<String> myList = Arrays.asList(new String[]{"a", "b","c","d"});
        List<String> sub =  myList.subList(0,2);
System.out.println(myList);
System.out.println(sub);



    }
}
