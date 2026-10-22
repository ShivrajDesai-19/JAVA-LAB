class MyThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}

class Main {
    public static void main(String[] args) {
        MyThread obj = new MyThread();
        Thread t = new Thread(obj);
        t.start();
    }
}
