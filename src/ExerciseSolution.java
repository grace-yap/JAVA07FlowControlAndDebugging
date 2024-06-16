import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ExerciseSolution {
    public static void main(String[] args) {
        String components[] = {"2000", "01", "01"};
        demo_CreateDate(components);
    }

    public static void demo_CreateDate(String[] components) {
        if(components.length >= 3) {
        // if(components.length > 3) {
            String year = components[0];
            String month = components[1];
            String day = components[2];
            String myDate = year + "-" + month + "-" + day;

            LocalDate myLocalDate = LocalDate.parse(myDate);

            if(myLocalDate != null) {
                System.out.println(myLocalDate.format(DateTimeFormatter.ISO_DATE));
            } else {
                System.out.println("Error creating date from command line args");
            }
        } else {
            System.out.println("Cannot create date");
        }
    }
}

/* Problem:
 * - "Cannot create date" is displayed when program is run.
 *
 * Steps to Debug if-else Exercise:
 * 1. Add breakpoint in the if condition.
 * 2. Run app in debug mode.
 * 3. Step Into the if statement.
 *      - App immediately directs you to the else portion.
 *      - This means that there's a problem with the if condition.
 * 4. Instead of > 3, it should be >= 3 or = 3.
 *      - This is because we only need 3 components to create our Local Date,
 *        so checking for more than 3 components is a simple error in our business logic.
 * 5. Stop debug.
 * 6. Run app to confirm bug is fixed.
 */