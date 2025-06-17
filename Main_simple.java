/**
 * Pet Shop Management System - OOP Example
 * For Python developers learning Java
 */

// Pet base class
class Pet {
    // Attributes (member variables)
    private String name;

    // Constructor (similar to Python's __init__)
    public Pet(String name) {
        this.name = name;
    }

    // Getter and Setter methods (commonly used in Java to access private fields)
    public String getName() {
        return name;
    }

    // Common pet behaviors
    public void eat() {
        System.out.println(name + " is eating");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    // Override toString method for easy object printing
    @Override
    public String toString() {
        return "Pet: " + name;
    }
}

// Dog class - extends Pet class
class Dog extends Pet {

    // Constructor
    public Dog(String name) {
        super(name); // Call parent constructor
    }

    // Override parent method
    @Override
    public void eat() {
        System.out.println(getName() + " is eating dog food");
    }

    // Special method
    public void bark() {
        System.out.println(getName() + " is barking!");
    }

    // Override toString method
    @Override
    public String toString() {
        return super.toString();
    }
}

// Main class, program entry point
public class Main {
    public static void main(String[] args) {

        // Create different pets
        Dog dog1 = new Dog("Buddy");

        // Pet behavior demonstration
        System.out.println("\nPet Behavior Demo:");
        dog1.eat();
        dog1.bark();
        dog1.sleep();
    }
}
