class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}

class Main {
    public static void main(String[] args)
            throws InterruptedException {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        System.out.println("Both threads completed");
    }
}
