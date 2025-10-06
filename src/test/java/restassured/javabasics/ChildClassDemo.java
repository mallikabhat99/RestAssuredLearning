package restassured.javabasics;

public class ChildClassDemo extends ParentClassDemo {
    public void newEngine() {
        System.out.println("new engine");
    }

    public void getColor() {
        System.out.println(color);
    }

    public static void main(String[] args) {
        ChildClassDemo cd = new ChildClassDemo();
        cd.gear();
        cd.brakes();
        cd.getColor();
        cd.newEngine();
    }
}
