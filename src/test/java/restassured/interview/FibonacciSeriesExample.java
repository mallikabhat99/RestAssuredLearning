package restassured.interview;
import java.util.Scanner;

public class FibonacciSeriesExample {
    public static void main(String[] args) {
        int fiblength =9;
        int[] num = new int[fiblength];
     //Assign values 0 and 1 to the 0 and 1 indices of the defined array
        num[0] = 0;
        num[1] = 1;

     //Logic for getting the values of all the indices of the array using for loop
        for (int i = 2; i < fiblength; i++) {
            num[i] = num[i - 1] + num[i - 2];
        }

        System.out.print("fibonacci series: ");
     //Printing the fibonacci series
        for (int i = 0; i < fiblength; i++) {
            System.out.print(num[i] + " ");
        }

    }
}
//ok