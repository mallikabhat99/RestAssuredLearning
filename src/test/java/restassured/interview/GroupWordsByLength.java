package restassured.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupWordsByLength {

    public static void main(String[] args) {
        List<String> arr = Arrays.asList("ant","elephant","crocodile","cow","cat");
        HashMap<Integer,String> map = new HashMap<>();
        for(String item : arr){
            int length = item.length();
            if(map.containsKey(length)){
                map.put(length, map.get(length) + "," + item);
            }
            else
                map.put(length,item);
        }
        System.out.println(map);
    }
}
//ok