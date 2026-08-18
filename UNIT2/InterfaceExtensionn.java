// Base interface
interface Vehicle {
    void start();
}

// Extended interface inheriting from Vehicle
interface AdvancedVehicle extends Vehicle {
    void fly();
}

// Implementing the extended interface
class FlyingCar implements AdvancedVehicle {
    @Override
    public void start() {
        System.out.println("Car engine started normally.");
    }

    @Override
    public void fly() {
        System.out.println("Car is now flying in the sky!");
    }
}

public class InterfaceExtensionn {
    public static void main(String[] args) {
        System.out.println("--- Interface Inheritance Demo ---");
        FlyingCar myCar = new FlyingCar();
        myCar.start();
        myCar.fly();
    }
}