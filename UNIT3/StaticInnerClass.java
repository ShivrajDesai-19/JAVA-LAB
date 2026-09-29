// Write a java program to use Static Inner Class

class Outer {
    static String message = "Hello from Static Inner Class!";

    static class Inner {
        void show() {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        
        Outer.Inner inner = new Outer.Inner();
        inner.show();
    }
}