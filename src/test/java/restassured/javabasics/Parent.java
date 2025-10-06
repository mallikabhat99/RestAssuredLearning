package restassured.javabasics;

public class Parent {
    public static void main(String[] args) {
        System.out.println("I started java learning");
        int a = 5;
        int b = 6;
        int sum = a + b;
        System.out.println("Sum is :" + sum);

        // new - memory allocation operato
        Methods js = new Methods();
        System.out.println(js.validatedHeader() + " :return int");

        // header in every page must be same
        String s = "Payment $100 is paid";
        System.out.println(s.charAt(8));
        System.out.println(s.indexOf("$"));
        System.out.println(s.substring(8));

        AustralianTraffic at = new AustralianTraffic();
        at.greenGo();
        at.redStop();
        at.flashYellow();

// array is a container which stores multiple values of same data type
        int[] c = new int[5]; // array declaration and memory allocation
        c[0] = 1;
        c[1] = 3;
        c[2] = 4;
        c[3] = 6;
        c[4] = 9;

        for (int i : c) {
            System.out.println(i);

        }

        int[] k = {1,2,3,4,5,6};
        for (int p : k){
            System.out.println(p);
        }

    }
}
