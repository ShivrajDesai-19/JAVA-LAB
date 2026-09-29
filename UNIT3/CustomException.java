// Write a java program to implement custom exception

class MyException extends Exception {
}

class SimpleException {
    public static void main(String[] args) {
	
        try {
		
            throw new MyException();
            
        }
		
		catch (MyException e) {
		
            System.out.println("Custom Exception Caught!");
        }
    }
}