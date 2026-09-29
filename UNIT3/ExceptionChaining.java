// Write a java program to implement Exception Chaining

class ExceptionChainingDemo {
    public static void main(String[] args) {
        try {
            calculate();
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
            System.out.println("Original Cause: " + e.getCause());
        }
    }

    static void calculate() {
        try {
            int result = 10 / 0; 
        } catch (ArithmeticException e) {
            
            throw new RuntimeException("Calculation failed", e);
        }
    }
}