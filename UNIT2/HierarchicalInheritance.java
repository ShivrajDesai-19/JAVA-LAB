// Superclass
class Shape {
    void draw() {
        System.out.println("Drawing a generic shape...");
    }
}

// Subclass 1
class Circle extends Shape {
    void drawCircle() {
        System.out.println("Drawing a Circle.");
    }
}

// Subclass 2
class Rectangle extends Shape {
    void drawRectangle() {
        System.out.println("Drawing a Rectangle.");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        System.out.println("--- Hierarchical Inheritance Demo ---");
        
        Circle c = new Circle();
        c.draw();       // Inherited from Shape
        c.drawCircle(); // Specific to Circle

        System.out.println();

        Rectangle r = new Rectangle();
        r.draw();         // Inherited from Shape
        r.drawRectangle(); // Specific to Rectangle
    }
}