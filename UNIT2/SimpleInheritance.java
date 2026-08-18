// Superclass (Parent)
class Employee {
    String name = "Rahul";
    double salary = 45000.0;

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Subclass (Child) inheriting from Employee
class Programmer extends Employee {
    String programmingLanguage = "Java";

    void displayProgrammerDetails() {
        // Accessing parent class method and variables
        displayDetails();
        System.out.println("Primary Language: " + programmingLanguage);
    }
}

public class SimpleInheritance {
    public staticmain(String[] args) {
        System.out.println("--- Simple Inheritance Demo ---");
        Programmer p = new Programmer();
        p.displayProgrammerDetails();
    }
}