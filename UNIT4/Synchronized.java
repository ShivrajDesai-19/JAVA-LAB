class Display {
    synchronized void show(String msg) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(msg);
        }
    }
}

class MyThread extends Thread {
    Display d;
    String msg;

    MyThread(Display d, String msg) {
        this.d = d;
        this.msg = msg;
    }

    public void run() {
        d.show(msg);
    }
}

class Main {
    public static void main(String[] args) {
        Display d = new Display();

        MyThread t1 = new MyThread(d, "Hello");
        MyThread t2 = new MyThread(d, "Welcome");

        t1.start();
        t2.start();
    }
}
