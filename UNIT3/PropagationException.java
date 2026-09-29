// Write a java program to implement Exception Propagation

class SimplePropagation {

    
    static void m1() {
        int data = 50 / 0; 
    }

    
    static void m2() {
        m1(); 
    }

   
    public static void main(String[] args) {
	
        try {
            m2();
        }
		
		catch (ArithmeticException e) {
            System.out.println("Handled in main!");
        }
    }
}