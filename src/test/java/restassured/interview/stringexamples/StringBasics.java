package restassured.interview.stringexamples;

import java.util.StringJoiner;

public class StringBasics {
    public static void main(String[] args) {
        String str1 = "Mallika Bhat";
        String str2 = new String("Bhat    Mallika   ");

        System.out.println(str2.trim()); //leading and trailing spaces
        System.out.println("Replaced"+(str2.replaceAll("\\s+","")));

        System.out.println(str1);
        System.out.println(str2);

        //String to integer
        String str3 = "123";
        int value = Integer.parseInt(str3);
        System.out.println(value);

        //Integer to String
        String str4 = String.valueOf(value);
        System.out.println(str4+ "555");


        StringJoiner myString = new StringJoiner("-");
        myString.add("Mallikaaaa");
        myString.add("Bhatttt");
        System.out.println(myString);

    }
}
