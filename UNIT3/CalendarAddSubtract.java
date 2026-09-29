```java
import java.util.Calendar;

public class CalendarAddSubtract {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        System.out.println("Current Date and Time: " + cal.getTime());

        // Add 5 days
        cal.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println("After adding 5 days: " + cal.getTime());

        // Subtract 3 days
        cal.add(Calendar.DAY_OF_MONTH, -3);
        System.out.println("After subtracting 3 days: " + cal.getTime());

        // Add 2 months
        cal.add(Calendar.MONTH, 2);
        System.out.println("After adding 2 months: " + cal.getTime());

        // Subtract 1 month
        cal.add(Calendar.MONTH, -1);
        System.out.println("After subtracting 1 month: " + cal.getTime());
    }
}
```
