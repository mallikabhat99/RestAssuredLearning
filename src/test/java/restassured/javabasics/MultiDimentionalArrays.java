package restassured.javabasics;

import java.util.Arrays;

public class MultiDimentionalArrays {
    public static void main(String[] args) {
// row , colmn
        int[][] a = new int[2][3];
        a[0][0] = 1;
        a[0][1] = 2;
        a[0][2] = 3;
        a[1][0] = 4;
        a[1][1] = 5;
        a[1][2] = 6;
        System.out.println(Arrays.deepToString(a));

        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }


    }
}
