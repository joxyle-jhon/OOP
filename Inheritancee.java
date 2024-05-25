public class Animal {
    // Attributes common to all animals
    protected String name;
    protected int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Common method to display information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Common method to make a sound (to be overridden by subclasses)
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

public class Dog extends Animal {
    // Additional attribute specific to Dog
    private String breed;

    // Constructor
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // Override the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    // Method specific to Dog
    public void fetch() {
        System.out.println(name + " is fetching the ball");
    }

    // Override displayInfo to include breed
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + breed);
    }
}
public class Cat extends Animal {
    // Additional attribute specific to Cat
    private String color;

    // Constructor
    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    // Override the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }

    // Method specific to Cat
    public void purr() {
        System.out.println(name + " is purring");
    }

    // Override displayInfo to include color
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Color: " + color);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of Dog and Cat
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        Cat cat = new Cat("Whiskers", 2, "Black");

        // Display information and make sounds
        dog.displayInfo();
        dog.makeSound();
        dog.fetch();

        System.out.println();

        cat.displayInfo();
        cat.makeSound();
        cat.purr();
    }
}
