package restassured.interview;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {

        int[] sourceArray = {1, 2, 3, 4, 5};
        int[] destinationArray1 = new int[sourceArray.length];
        System.arraycopy(sourceArray, 0, destinationArray1, 0, sourceArray.length);
        System.out.println(Arrays.toString(destinationArray1));

        int[] destinationArray2 = Arrays.copyOf(sourceArray, sourceArray.length);
        System.out.println(Arrays.toString(destinationArray2));

        int[] destinationArray3 = sourceArray.clone();
        System.out.println(Arrays.toString(destinationArray3));


        int[] destinationArray4 = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            destinationArray4[i] = sourceArray[i];
        }
        System.out.println(Arrays.toString(destinationArray4));





    }
    }
