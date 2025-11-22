package restassured.interview;

import java.util.HashMap;
import java.util.Set;

public class CountWordsInString {
    public static void main(String[] args) {

        String sentence = "Mallika Bhat Java Automation Bhat Java Here We are not Bhat checking Java";
        String[] words = sentence.split(" ");
        HashMap<String,Integer> map = new HashMap<>();

        for(String word : words){
            if(map.containsKey(word)){
                map.put(word,map.get(word)+1);
            }
            else
                map.put(word,1);
        }
System.out.println(map);

        Set<String> keys = map.keySet();
        for( String key : keys){
            if(map.get(key)>1)
                System.out.println(key + " count is :" + map.get(key));
        }

    }
}