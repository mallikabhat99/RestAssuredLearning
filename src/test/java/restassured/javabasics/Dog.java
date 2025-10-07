package restassured.javabasics;

class Dog {
    String name;
    String breed;

    // Parameterized Constructor
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // No-arg Constructor (if also desired)
    public Dog() {
        this.name = "Unknown";
        this.breed = "Mixed";
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Breed: " + breed);
    }
}

