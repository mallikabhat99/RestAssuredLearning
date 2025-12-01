package restassured.interview.collections;

import java.util.Arrays;

public class BinarySearchAlgorithm {

    public static void main(String[] args) {

        int[] array = new int[100];
        int target = 56;
        for(int i=0;i<array.length;i++){
            array[i] = i;
        }
        //Arrays.sort(array);
        int index = binarySearchMethod(array,target);
        //int index = Arrays.binarySearch(array,target);
        if(index==-1){
            System.out.println("Target not found");
        }
        else
            System.out.println("Target found at index " + index);

    }

    private static int binarySearchMethod(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while(low <= high) {
            int middle = low + (high - low) / 2;
            int middleValue = array[middle];
            System.out.println("middle: " + middleValue);
            if(middleValue < target) low = middle+1;
            else if(middleValue > target) high = middle -1;
            else return middle; //target found
        }

        return -1;
    }

}
