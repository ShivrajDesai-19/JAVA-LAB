public class OddEvenCheck {
    public static void main(String[] args) {
        // Convert the first command-line argument to an integer
        int number = Integer.parseInt(args[0]);

        // Check if the number is divisible by 2
        if (number % 2 == 0) {
            System.out.println(number + " is an EVEN number.");
        } else {
            System.out.println(number + " is an ODD number.");
        }
    }
}