class Student {
    // Private fields (data hiding)
    private String name;
    private int age;
    private double gpa;

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for age with basic validation
    public void setAge(int age) {
        if (age > 0 && age < 120) {
            this.age = age;
        } else {
            System.out.println("Invalid age entered!");
        }
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for gpa
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Getter for gpa
    public double getGpa() {
        return gpa;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        System.out.println("Encapsulation");
        
        Student student = new Student();
        
        // Setting values using setters
        student.setName("Aman");
        student.setAge(21);
        student.setGpa(8.7);

        // Accessing values using getters
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
        System.out.println("Student GPA: " + student.getGpa());
    }
}