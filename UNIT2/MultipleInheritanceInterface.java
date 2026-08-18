// First interface
interface Walker {
    void walk();
}

// Second interface
interface Swimmer {
    void swim();
}

// Implementing multiple interfaces in a single class
class Duck implements Walker, Swimmer {
    @Override
    public void walk() {
        System.out.println("Duck is walking on the ground.");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming in the pond.");
    }
}

public class MultipleInheritanceInterface {
    public static void main(String[] args) {
        System.out.println("--- Multiple Inheritance via Interfaces ---");
        Duck d = new Duck();
        d.walk();
        d.swim();
    }
}