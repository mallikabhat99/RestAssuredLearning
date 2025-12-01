package restassured.interview;
import java.util.Scanner;

public class InterestCalculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Get principal, rate, and time from the user
        System.out.print("Enter the principal amount: ");
        double principal = in.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double rate = in.nextDouble();
        System.out.print("Enter the time in years: ");
        double time = in.nextDouble();

        System.out.println("Enter the type of interest ('S' for Simple, 'C' for Compound): ");
        char type = in.next().charAt(0);

        double interest = 0.0;
        boolean isValidType = true;

        // Calculate interest based on user choice
        switch (type) {
            case 'S':
            case 's':
                // Formula for Simple Interest: SI = (P * T * R) / 100
                interest = (principal * time * rate) / 100;
                break;
            case 'C':
            case 'c':
                // Formula for Compound Interest: CI = P * (1 + R/100)^T - P
                interest = principal * (Math.pow((1 + rate / 100), time)) - principal;
                break;
            default:
                isValidType = false;
                System.out.println("Invalid interest type entered.");
                break;
        }

        // Display results if the interest type was valid
        if (isValidType) {
            double amount = principal + interest;
            System.out.println("\nPrincipal Amount: " + principal);
            System.out.println("Interest Rate: " + rate + "%");
            System.out.println("Time Period: " + time + " years");
            System.out.println("Calculated Interest: " + interest);
            System.out.println("Total Amount (Principal + Interest): " + amount);
        }

        in.close(); // Close the scanner
    }
}
//ok