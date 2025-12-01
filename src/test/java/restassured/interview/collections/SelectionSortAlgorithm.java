package restassured.interview.collections;

import java.util.Arrays;

public class SelectionSortAlgorithm {

    public static void main(String[] args) {
        int[] array = new int[]{7,8,35,6,5,3,1};
        System.out.println(Arrays.toString(array));
        selectionSort(array);
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++)
        {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j])
                    min = j;

            }
            int temp = array[i];
            array[i] = array[min];
           array[min] = temp;
        }

        System.out.println(Arrays.toString(array));

    }

}
