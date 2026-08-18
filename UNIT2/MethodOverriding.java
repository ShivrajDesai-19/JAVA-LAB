// Superclass
class Vehicle {
    void startEngine() {
        System.out.println("Starting vehicle's default engine...");
    }
}

// Subclass overriding parent method
class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Starting Car engine with a push button start!");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        System.out.println("Vehicle");
        
        Vehicle v = new Vehicle();
        v.startEngine(); // Calls Vehicle's method

        Car c = new Car();
        c.startEngine(); // Calls overridden Car's method
    }
}