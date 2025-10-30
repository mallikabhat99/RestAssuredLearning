package restassured.interview;

public class ReverseString {
    public static void main(String[] args) {
        String inputString = "Malayalam";
        String outputString = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            outputString = outputString + inputString.charAt(i);
        }
        System.out.println(outputString);
        if(inputString.equalsIgnoreCase(outputString)){
            System.out.println("Palindrome yes!");
        }
    }
}
