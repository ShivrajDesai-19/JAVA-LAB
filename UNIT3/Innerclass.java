// Write a java program to use simple inner class in your program

class Outer {
    class Inner {
        void show() {
            System.out.println("Hello from Inner Class!");
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.show();
    }
}