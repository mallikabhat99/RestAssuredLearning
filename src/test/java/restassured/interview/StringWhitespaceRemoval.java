package restassured.interview;

public class StringWhitespaceRemoval {
    public static void main(String[] args) {
        String s1 = "   Hello World   ";
        String s2 = "\u2003" + "Unicode Space" + "\u2003"; // U+2003 is an em space

        System.out.println("Original s1: ===\"" + s1 + "\"===");
        System.out.println("s1.trim():   ===\"" + s1.trim() + "\"===");
        System.out.println("s1.strip():  ===\"" + s1.strip() + "\"===");

        System.out.println("\nOriginal s2: ===\"" + s2 + "\"===");
        System.out.println("s2.trim():   ===\"" + s2.trim() + "\"==="); // trim might not remove U+2003
        System.out.println("s2.strip():  ===\"" + s2.strip() + "\"==="); // strip will remove U+2003
    }
}