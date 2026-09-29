// Write a java program to display date in different format

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class ShowDate {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        // Format 1: 29/09/2026
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Format 1: " + today.format(f1));

        // Format 2: 2026-09-29
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Format 2: " + today.format(f2));

        // Format 3: Sep 29, 2026
        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("MMM dd, yyyy");
        System.out.println("Format 3: " + today.format(f3));

        // Format 4: Tuesday, September 29, 2026
        DateTimeFormatter f4 = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");
        System.out.println("Format 4: " + today.format(f4));
    }
}