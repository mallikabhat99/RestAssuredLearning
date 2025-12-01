package restassured.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SumOfTwoNumbersInArray {

    public static void hasTwoSum(List<Integer> numbers , Integer target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(Integer num: numbers){
            int complement = target-num;
            if(map.containsKey(complement)){
                System.out.println("Match found "+ complement + " and "+ num);
            }
            else
                map.put(num,1);
        }

        System.out.println(map);
    }
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        List<Integer> numList = new ArrayList<>(Arrays.asList(3,2, 7, 8, 1,6,16,18));
        int target1 = 7;

        System.out.println(numList);
        hasTwoSum(numList, target1); // Output: true (2 + 7 = 9)
    }

}
