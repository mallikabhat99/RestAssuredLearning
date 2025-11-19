package restassured.interview;
import java.util.HashMap;

public class CountNumOfCharsInStringExample {
    static void characterCount(String inputString) {

     HashMap<Character,Integer> map = new HashMap<>();
     char[] strArray = inputString.toCharArray();

     for(char c : strArray){
         if (map.containsKey(c)) {
             map.put(c ,map.get(c)+1);
         }
         else
             map.put(c ,1);
     }

     System.out.println(map);
    }

    public static void main(String[] args) {
// Input value which needs to be passed in the below method.
        characterCount("mallikabhat99@gmail.com");

    }
}
