package restassured.interview;

import java.util.*;

public class CheckIfXYZIsMiddleOfString {
    public static void main(String[] args) {
        String testString = "ABBxyzAA";
        String[] words = testString.split("xyz");
        List<Integer> wordLength = new ArrayList<>();
        for(String word : words){
            int length = word.length();
            wordLength.add(length);
        }
        int difference = wordLength.get(0)-wordLength.get(1);
        System.out.println(difference);
        if(Math.abs(difference)<=1 ){
            System.out.println("XYZ is in middle : true");
        }
        else
            System.out.println("XYZ is in not middle : false");

    }

}
