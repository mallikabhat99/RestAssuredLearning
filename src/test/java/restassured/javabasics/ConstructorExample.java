package restassured.javabasics;

public class ConstructorExample {
    public static void main(String[] args) {
        // Using the parameterized constructor
        Dog myDog = new Dog("Buddy", "Golden Retriever");
        myDog.displayInfo(); // Output: Name: Buddy, Breed: Golden Retriever

        // Using the no-arg constructor
        Dog strayDog = new Dog();
        strayDog.displayInfo(); // Output: Name: Unknown, Breed: Mixed
    }
}