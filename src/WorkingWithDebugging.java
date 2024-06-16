public class WorkingWithDebugging {
    public static void main(String[] args) {
        String andy = getUserById(0);
        System.out.println(andy);

        String nelle = getUserById(10);
        System.out.println(nelle);
        System.out.println();

        demo_performCalculations(4,0);
        // A breakpoint will break the flow of an app, pausing it at this line of code
        //      if the app has been run in debug mode.
    }

    //---------------------------------------06 Using the Eclipse Debugger
    public static String getUserById(int id) {
        String users[] = {"Andy", "Elle", "April", "Nelle"};
        // causes error (for 06 Eclipse Debugger lesson):
        //return users[id];
        // correct return:
        return (id >= 0 && id < users.length) ? users[id] : null;
    }
    //---------------------------------------06 Using the Eclipse Debugger

    //---------------------------------------07 Setting Breakpoints and Stepping through Code
    //---------------------------------------08 Debugging Variables
    public static void demo_performCalculations(double value1, double value2) {
        double sum = Calculator.add(value1, value2);
        System.out.println("Sum is: " + sum);

        double difference = Calculator.subtract(value1, value2);
        System.out.println("Difference is: " + difference);

        double product = Calculator.multiply(value1, value2);
        System.out.println("Product is: " + product);

        double quotient = Calculator.divide(value1, value2);
        System.out.println("Quotient is: " + quotient);
    }
    //---------------------------------------07 Setting Breakpoints and Stepping through Code
    //---------------------------------------08 Debugging Variables
}
