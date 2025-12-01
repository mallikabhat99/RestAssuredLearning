package restassured.interview;

import org.testng.Assert;

import java.util.Arrays;
import java.util.*;

public class ArrayMoveZerosToEnd {
    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<>(Arrays.asList(2,0,3,0,4,0,5,0));
        List<Integer> expectedList = new LinkedList<>(Arrays.asList(2,3,4,5,0,0,0,0));

        int count = 0;
        for(int i=0;i<integerList.size();i++){
            if(integerList.get(i).equals(0)){
                integerList.remove(i);
                count++;
            }
        }
        for(int j=0;j<count;j++){
            integerList.add(0);
        }
       System.out.println(integerList);
        Assert.assertEquals(integerList,expectedList,"Lists are not eqaul!");
    }
}
