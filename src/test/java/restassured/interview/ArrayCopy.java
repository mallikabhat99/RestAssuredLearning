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

        int[] destinationArray3 = sourceArray.clone(); //shallow copy
        System.out.println(Arrays.toString(destinationArray3));

        int[] destinationArray4 = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            destinationArray4[i] = sourceArray[i];
        }
        System.out.println(Arrays.toString(destinationArray4));

       // Shallow Copy:
        // It copies only the reference of nested objects, not the actual data.
        // Making changes to nested objects affect both the original and the copy.
       // Deep Copy: It creates a full,
        // independent copy of the object, including nested objects.
        // Making any changes to the copy do not affect the original object.
        int a[] = { 1, 8, 3, 5, 9, 10 };

        // Creating an array b[] and
        // copying elements of a[] to b[]
        int b[] = Arrays.copyOfRange(a, 2, 6);

        // Changing b[] to verify that
        // b[] is different from a[]
        b[0]++;  // Modify b[0] to check if it affects a[]

        // Iterating over array a[]
        System.out.println("aaaaaaaaaa\n");
        System.out.println(Arrays.toString(a));

        // Iterating over array b[]
        System.out.println("bbbbbbbbbb\n");
        System.out.println(Arrays.toString(b));


    }
    }
