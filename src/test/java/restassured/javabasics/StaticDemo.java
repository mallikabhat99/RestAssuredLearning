package restassured.javabasics;

public class StaticDemo {
    public static void main(String[] args)
    {
        // calling static method
        // without instantiating Student class
        Student.setCllg("XYZ");

        Student s1 = new Student("Geek1");
        Student s2 = new Student("Geek2");

        s1.getStudentInfo();
        s2.getStudentInfo();
    }
}