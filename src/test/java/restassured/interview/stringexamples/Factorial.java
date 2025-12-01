package restassured.interview.stringexamples;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a non -negative number");
        int num = input.nextInt();
        input.close();

        if (num < 0) {
            System.out.println("Enter a non -negative number");
        } else if (num == 0) {
            System.out.println("facortial of 0 is 1");
        } else {
            long factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("facortial of " + num + "is" + factorial);

        }

    }
}
