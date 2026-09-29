import java.util.Scanner;

public class DirectArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter Elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print("Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}