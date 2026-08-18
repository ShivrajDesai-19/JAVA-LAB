// Grandparent class
class LivingBeing {
    void breathe() {
        System.out.println("Breathing oxygen...");
    }
}

// Parent class inheriting from LivingBeing
class Mammal extends LivingBeing {
    void run() {
        System.out.println("Mammal is running on four legs.");
    }
}

// Child class inheriting from Mammal
class Dog extends Mammal {
    void bark() {
        System.out.println("Dog says: Bow Wow!");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        System.out.println("--- Multilevel Inheritance Demo ---");
        Dog myDog = new Dog();
        
        // Accessing methods from all levels of inheritance
        myDog.breathe(); // from LivingBeing
        myDog.run();     // from Mammal
        myDog.bark();    // from Dog
    }
}