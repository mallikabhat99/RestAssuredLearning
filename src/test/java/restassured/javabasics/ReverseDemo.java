package restassured.javabasics;

public class ReverseDemo {
    public static void main(String[] args) {
        String s = "Mallika";
        StringBuilder r = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.println(s.charAt(i));
            r.append(s.charAt(i));
            System.out.println(r);
        }

    }
}
