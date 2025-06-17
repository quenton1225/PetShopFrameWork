/**
 * Pet Shop Management System - OOP Example
 * For Python developers learning Java
 */

// Pet base class
class Pet {
    // Attributes (member variables)
    private String name;
    private int age;
    private double price;
    
    // Constructor (similar to Python's __init__)
    public Pet(String name, int age, double price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }
    
    // Getter and Setter methods (commonly used in Java to access private fields)
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getPrice() {
        return price;
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
        return "Pet: " + name + ", Age: " + age + ", Price: $" + price;
    }
}

// Dog class - extends Pet class
class Dog extends Pet {
    private String breed; // Breed
    
    // Constructor
    public Dog(String name, int age, double price, String breed) {
        super(name, age, price); // Call parent constructor
        this.breed = breed;
    }
    
    public String getBreed() {
        return breed;
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
        return super.toString() + ", Breed: " + breed;
    }
}

// Cat class - extends Pet class
class Cat extends Pet {
    private String color; // Color
    
    // =============================
    // EXERCISE 1: Complete the Cat constructor
    // Hint: Look at the Dog constructor for reference
    // =============================
    public Cat(String name, int age, double price, String color) {
        // Your code here
    }
    
    public String getColor() {
        return color;
    }
    
    @Override
    public void eat() {
        System.out.println(getName() + " is eating cat food");
    }
    
    // Special method
    public void meow() {
        System.out.println(getName() + " is meowing!");
    }
    
    // =============================
    // EXERCISE 2: Override the toString method
    // Hint: Look at Dog's toString method for reference
    // =============================
    @Override
    public String toString() {
        // Your code here
    }
}

// Pet Shop class
class PetShop {
    private String name;
    private Pet[] pets; // Array to store pets
    private int count; // Current number of pets
    
    public PetShop(String name, int capacity) {
        this.name = name;
        this.pets = new Pet[capacity]; // Create array with specified capacity
        this.count = 0;
    }
    
    // Add pet to shop
    public void addPet(Pet pet) {
        if (count < pets.length) {
            pets[count] = pet;
            count++;
            System.out.println("Successfully added pet: " + pet.getName());
        } else {
            System.out.println("Pet shop is full, cannot add more pets");
        }
    }
    
    // Display all pets
    public void showAllPets() {
        System.out.println("\n" + name + "'s Pet List:");
        System.out.println("------------------------");
        
        if (count == 0) {
            System.out.println("No pets in the shop");
        } else {
            // =============================
            // EXERCISE 3: Complete the for loop to display all pets
            // Hint: Look at the for loop in the sellPet method below
            // =============================
            // Your code here
        }
        System.out.println("------------------------");
    }
    
    // Sell a pet
    public Pet sellPet(int index) {
        if (index < 0 || index >= count) {
            System.out.println("Invalid pet index");
            return null;
        }
        
        Pet soldPet = pets[index];
        
        // Move array elements to fill the gap (similar to Python's list.pop())
        for (int i = index; i < count - 1; i++) {
            pets[i] = pets[i + 1];
        }
        
        pets[count - 1] = null;
        count--;
        
        System.out.println("Sold: " + soldPet.getName() + ", Price: $" + soldPet.getPrice());
        return soldPet;
    }
    
    // =============================
    // EXERCISE 7: CHALLENGE - Create a method to find the most expensive pet
    // Return the most expensive pet in the shop
    // =============================
    public Pet findMostExpensivePet() {
        // Your code here
    }
}

// Fish class - extends Pet class
class Fish extends Pet {
    private String waterType; // "Freshwater" or "Saltwater"
    
    public Fish(String name, int age, double price, String waterType) {
        super(name, age, price);
        this.waterType = waterType;
    }
    
    // =============================
    // EXERCISE 4: Complete the getWaterType method
    // Hint: Look at Dog's getBreed method for reference
    // =============================
    public String getWaterType() {
        // Your code here
    }
    
    @Override
    public void eat() {
        System.out.println(getName() + " is eating fish food");
    }
    
    // Special method for fish
    public void swim() {
        System.out.println(getName() + " is swimming!");
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Water Type: " + waterType;
    }
}

// Main class, program entry point
public class SimplePetShop {
    public static void main(String[] args) {
        // Create pet shop
        PetShop shop = new PetShop("Happy Pet Shop", 10);
        
        // Create different pets
        Dog dog1 = new Dog("Buddy", 2, 1500, "Golden Retriever");
        Dog dog2 = new Dog("Rex", 1, 2000, "Husky");
        Cat cat1 = new Cat("Whiskers", 3, 1000, "White");
        Cat cat2 = new Cat("Mittens", 2, 1200, "Tabby");
        Fish fish1 = new Fish("Nemo", 1, 50, "Saltwater");
        
        // Add pets to shop
        shop.addPet(dog1);
        shop.addPet(dog2);
        shop.addPet(cat1);
        shop.addPet(cat2);
        shop.addPet(fish1);
        
        // Display all pets in shop
        shop.showAllPets();
        
        // Pet behavior demonstration
        System.out.println("\nPet Behavior Demo:");
        dog1.eat();
        dog1.bark();
        dog1.sleep();
        
        cat1.eat();
        cat1.meow();
        cat1.sleep();
        
        fish1.eat();
        fish1.swim();
        
        // =============================
        // EXERCISE 5: Complete the code to sell a pet and show updated list
        // Hint: Use the sellPet method with index 0, then call showAllPets
        // =============================
        System.out.println("\nSelling Pets:");
        // Your code here
        
        
        // Polymorphism demonstration
        System.out.println("\nPolymorphism Demo:");
        Pet pet = new Dog("Max", 1, 1800, "Samoyed");
        pet.eat(); // Will call Dog's eat method
        
        // =============================
        // EXERCISE 6: Complete the instanceof check and type casting
        // Check if pet is a Dog, and if true, cast it and call the bark method
        // =============================
        // Your code here
        
        
        // Find and display the most expensive pet
        System.out.println("\nMost Expensive Pet:");
        Pet expensivePet = shop.findMostExpensivePet();
        if (expensivePet != null) {
            System.out.println(expensivePet);
        } else {
            System.out.println("No pets in the shop");
        }
    }
}
