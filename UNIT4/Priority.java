class Main {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("Thread is running");
        });

        t.setName("MyThread");
        t.setPriority(8);

        System.out.println("Name: " + t.getName());
        System.out.println("Priority: " + t.getPriority());

        t.start();
    }
}
