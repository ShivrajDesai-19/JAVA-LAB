// Write a java program to display different calendar information using calendar class

import java.util.Calendar;

class CalendarInfo{
    public static void main(String[] args) {
        // Get the current calendar instance
        Calendar cal = Calendar.getInstance();

        // Display individual calendar information
        System.out.println("Year: " + cal.get(Calendar.YEAR));
        System.out.println("Month: " + (cal.get(Calendar.MONTH) + 1)); // 0 = January, so +1
        System.out.println("Day of Month: " + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("Day of Week: " + cal.get(Calendar.DAY_OF_WEEK)); // 1 = Sunday
        System.out.println("Hour: " + cal.get(Calendar.HOUR));
        System.out.println("Minute: " + cal.get(Calendar.MINUTE));
        System.out.println("Second: " + cal.get(Calendar.SECOND));
    }
}