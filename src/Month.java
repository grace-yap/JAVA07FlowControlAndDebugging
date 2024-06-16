/* enum
 * - An enum type is a special data type that we can create in Java.
 * - It allows us to define a preset amount of constants that are the only possible values for the data type.
 * - If this data type is used in the code, only those same constant values can ever be assigned to it.
 * - format:
 *      public enum <enum_variable> {
 *          <comma-separated list of constants>
 *      }
 */

public enum Month {
    // since they're constants, we're declaring them in all caps
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
    JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    // for this specific use case, using an enum for a month is much better than representing it as a String
    //      or a number, since both of these data types basically have infinite possibilities, most of which
    //      are going to be invalid as an actual, usable month
}
