package restassured.interview;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
       int[] intArray = new int[]{1,2,3,4,5,6,7,8,9};
       int size = intArray.length;
       int index = 0;
       int[] temp = new int[size];

       for(int i=size-1;i>=0;i--){
           temp[i] = intArray[size-i-1];
           index = index+1;

       }
       System.out.println(Arrays.toString(temp));
    }
}
