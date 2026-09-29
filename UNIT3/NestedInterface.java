// Write a java program to use Nested Interface

class Outer {
    // Interface declared inside a class
    interface InnerInterface {
        void msg();
    }
}

class NestedInterface implements Outer.InnerInterface {
    public void msg() {
        System.out.println("Hello from Nested Interface!");
    }

    public static void main(String[] args) {
        Outer.InnerInterface obj = new Main();
        obj.msg();
    }
}