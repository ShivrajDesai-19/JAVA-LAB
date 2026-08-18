// Define an interface
interface Animal {
    void sound();
    void eat();
}

// Implement the interface in a class
class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks: Woof! Woof!");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating pedigree.");
    }
}

public class Interfacee {
    public static void main(String[] args) {
        // Create an object using interface reference
        Animal myDog = new Dog();
        
        System.out.println("--- Interface Demonstration ---");
        myDog.sound();
        myDog.eat();
    }
}