//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        demo_ifElse(1, 2);
        demo_ifElse(10, 2);
        demo_ternaryStatement(1, 2);
        demo_ternaryStatement(10, 2);
        System.out.println();

        demo_daysInMonth(2,false);
        demo_daysInMonth(2, true);
        demo_daysInMonth(9, false);
        demo_daysInMonth(9, true);
        demo_daysInMonth(-10, true);
        System.out.println();

        demo_daysInMonth_Switch(2,false);
        demo_daysInMonth_Switch(2, true);
        demo_daysInMonth_Switch(9, false);
        demo_daysInMonth_Switch(9, true);
        demo_daysInMonth_Switch(-10, true);
        System.out.println();

        demo_normalArray();
        demo_2dArray();
    }

    //---------------------------------------01 Using Ternary Statements
    public static void demo_ifElse(int x, int y) {
        int result;

        if(x < y) {
            result = x;
        } else {
            result = y;
        }

        System.out.println("Result is: " + result);
    }

    // The ternary operator is a shorthand conditional operator that's used when we want to do one thing
    //      if the condition is true and something else if the condition is false.
    public static void demo_ternaryStatement(int x, int y) {
        // ternary operator format: <boolean expression> ? <value if true> : <value if false>
        int result = (x<y) ? x : y;
        System.out.println("Result is (ternary): " + result);

        System.out.println("The value of result is: " + (result%2 == 0 ? "even" : "odd"));
        // - The ternary operator really shines when we only need to do a simple assignment one way or the other
        //      based on some condition.
        // - If we needed to get multiple things done if a condition was true, then the standard if block allows us
        //      to get more done, since we can use as many lines as we need.
        // - If we needed to check against more than one condition, the ternary operator has a limitation,
        //      since it can either go one way or the other, but third and fourth options don't really come into play.
        //      In those cases, a simple if-else block can always be extended into an if-else-if block,
        //      giving us the ability to query against more than one condition.
    }
    //---------------------------------------01 Using Ternary Statements

    //---------------------------------------02 Chaining if-else Statements
    public static void demo_daysInMonth(int month, Boolean isLeapYear) {
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("There are 31 days in the month");
        } else if (month == 4 || month == 6 || month == 9) {
            System.out.println("There are 30 days in the month");
        } else if (month == 2) {
            if(isLeapYear) {
                System.out.println("There are 29 days in the month");
            } else {
                System.out.println("There are 28 days in the month");
            }
        } else {
            System.out.println("Unknown month");
        }
    }
    //---------------------------------------02 Chaining if-else Statements

    //---------------------------------------03 Using a Switch Statement
    // for difference Boolean (from demo_daysInMonth) vs boolean (below), check:
    //      https://stackoverflow.com/questions/3728616/boolean-vs-boolean-in-java
    // specifically for knowing the days in month use case, boolean vs Boolean does not matter
    public static void demo_daysInMonth_Switch(int month, boolean isLeapYear) {
        /* switch
         * - format:
         *      switch (<calculation / expression>) {
         *          case <first value>:
         *              <code block>
         *          case <second value>:
         *              <code block>
         *          case <third value>:
         *              <code block>
         *          ...
         *          default:
         *              <code block>
         *      }
         *   *note: if multiple cases will execute the same code block, they can be set up in a line as below
         */
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("[Switch] There are 31 days in the month");
                // - break to exit the switch block WITHOUT evaluating any remaining cases
                // - if we didn't use break, then the program would move to the next line
                //      and attempt to match with other cases
                // - this is normal behavior, because there may be some scenarios where you might want to
                //      attempt to match other cases even after already matching one, so you might omit the break
                //      and stay in the switch block to keep checking
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("[Switch] There are 30 days in the month");
                break;
            case 2:
                System.out.println("[Switch] There are " + (isLeapYear ? "29" : "28") + " days in the month");
                break;
            // default -  case that's only going to be matched if no other cases matched,
            //            or if the omission of break statements caused this to fall into this case naturally
            default:
                System.out.println("[Switch] Unknown month");
        }
    }
    //---------------------------------------03 Using a Switch Statement

    //---------------------------------------04 Using Two Dimensional Arrays
    public static void demo_normalArray() {
        int normalArr[] = new int[5];
        normalArr[0] = 1;
        normalArr[1] = 2;
        normalArr[2] = 3;
        normalArr[3] = 4;
        normalArr[4] = 5;

        for(int n:normalArr) {
            System.out.println(n);
        }
    }

    public static void demo_2dArray() {
        // Create a 2D array
        // - our sub-arrays are whole strings, so we declare that first as the data type
        // - we're creating an array (twoDArray) with 5 elements where each of those elements is another array,
        //      a sub-array, with length 3, so it can hold 3 elements, and those elements must be Strings.
        // format: <variable type> <variable name>[][] = new <variable type>[<size>][<size>];
        String twoDArray[][] = new String[5][3];

        // Instantiating 5 arrays to be used as sub-arrays (of meals for a given weekday)
        String meals_Monday[] = {"apples", "beans", "cherries"};
        String meals_Tuesday[] = {"carrots", "eggs", "fish"};
        String meals_Wednesday[] = {"coffee", "donut", "pizza"};
        String meals_Thursday[] = {"beef", "potato", "kale"};
        String meals_Friday[] = {"squash", "oranges", "candy"};

        // TWO WAYS to assign sub-arrays to 2D array
        // #1 access the day array via index, and set it directly by passing in one of our sub-arrays
        twoDArray[0] = meals_Monday;
        twoDArray[1] = meals_Tuesday;
        twoDArray[2] = meals_Wednesday;
        twoDArray[3] = meals_Thursday;

        // #2 drill down into a 2D array using two sets of indexes
        // - access twoDArray element for Friday, a sub-array, and then from there,
        //      access that sub-array's individual elements directly, which are elements 0, 1, and 2
        // - and then set those strings directly with values coming from our meals_Friday sub-array
        //      using the equivalent indexes 0, 1, and 2 as well.
        twoDArray[4][0] = meals_Friday[0];
        twoDArray[4][1] = meals_Friday[1];
        twoDArray[4][2] = meals_Friday[2];
        // either one of these approaches is appropriate. depending on how and where your inputs are coming from,
        //      you would likely choose whichever is more convenient for you

        System.out.println("Weekday Food Chart");

        // parse 2D array using for loops
        // - the first for loop (the outermost loop) takes us through each of the five days in twoDArray,
        //      each of the five elements, one by one.
        for(int i = 0; i < twoDArray.length; i++) {
            System.out.print("\tDay " + (i+1) + ":");

            // - set up currentDay to be an array of strings, our sub-array, to br the focus of our innermost for loop
            // - loop through the elements of currentDay using j as the counter variable
            // -  we expect each element j to be a String food
            String[] currentDay = twoDArray[i];
            for(int j = 0; j < currentDay.length; j++) {
                System.out.print(" " + currentDay[j] + " ");
            }
            // move to new line using System.out.println
            System.out.println();
        }
    }
    //---------------------------------------04 Using Two Dimensional Arrays
}