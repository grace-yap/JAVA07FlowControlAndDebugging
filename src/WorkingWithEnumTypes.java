public class WorkingWithEnumTypes {
    public static void main(String[] args) {
        demo_getNumDaysInMonth(Month.FEBRUARY, true);
        // - in demo_daysInMonth_Switch() from Main.java, unless we write extra logic to make sure that the integer
        //      passed in is between 1 and 12, we're going to handle invalid inputs to the method.
        // - in our enum version that takes the Month type, we're going to be stopped from passing in anything
        //      that's not a part of the enum type, thereby eliminating that bit of potential for errors.
        // - for example, demo_getNumDaysInMonth(10, true); will return the ff error:
        //      java: incompatible types: int cannot be converted to Month
    }

    // because WorkingWithEnumTypes.java is in the same package as Month.java (that contains Month enum),
    //      we should be able to access the enum in here without any issues
    public static void demo_getNumDaysInMonth(Month month, Boolean isLeapYear) {
        switch (month){
            case SEPTEMBER: case APRIL: case JUNE: case NOVEMBER:
                System.out.println("There are 30 days in the month");
                break;
            case JANUARY: case MARCH: case MAY: case JULY: case AUGUST: case OCTOBER: case DECEMBER:
                System.out.println("There are 31 days in the month");
                break;
            case FEBRUARY:
                System.out.println("There are " + (isLeapYear ? "29" : "28") + " days in the month");
                break;
        }
    }
}
