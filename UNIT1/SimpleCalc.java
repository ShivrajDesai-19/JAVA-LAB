// Write  a  java  program  to  perform  different  arithmetic  operations.

public class SimpleCalc {
    public static void main(String[] args) {
        // Convert the first and third arguments from String to double
        double num1 = Double.parseDouble(args[0]);
        String operator = args[1];
        double num2 = Double.parseDouble(args[2]);

        // Perform and print the operation
        if (operator.equals("+")) {
            System.out.println("Result: " + (num1 + num2));
        } else if (operator.equals("-")) {
            System.out.println("Result: " + (num1 - num2));
        } else if (operator.equals("x")) {
            System.out.println("Result: " + (num1 * num2));
        } else if (operator.equals("/")) {
		System.out.println("Result: " + (num1 / num2));
        } else {
            System.out.println("Invalid Operator! Use +, -, x, or /");
        }
    }
}