// Abstract class with a method
abstract class Machine {
    // Abstract method to be overridden
    abstract void start();
    
    // Concrete method
    void stop() {
        System.out.println("Machine is shutting down.");
    }
}

// Subclass providing implementation for abstract method
class WashingMachine extends Machine {
    @Override
    void start() {
        System.out.println("Washing machine started filling water and spinning.");
    }
}

public class AbstractMethodOverriding {
    public static void main(String[] args) {
        System.out.println("Washing Machine");
        Machine myMachine = new WashingMachine();
        myMachine.start();
        myMachine.stop();
    }
}