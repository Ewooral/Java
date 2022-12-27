
public class OperatorAndMathClass {
    public static void main(String[] args) {

        int intValue1 = 56;
        int intValue2 = 42;

        int result1 = intValue1 + intValue2;
        System.out.println("Addition: " + result1);

        int result2 = intValue1 - intValue2;
        System.out.println("Subtraction: " + result2);

        int result3 = intValue1 * intValue2;
        System.out.println("Multiplication: " + result3);

        double result4 = (double) intValue1 / intValue2;
        System.out.println("Division: " + result4);

        int result5 = (int) intValue1 % intValue2;
        System.out.println("Remainder: " + result5);

        // Math.round
        double doubleValue = -3.99999;
        long rounded = Math.round(doubleValue);
        System.out.println("Rounded: " + rounded);

        // Math.abs
        double absValue = Math.abs(doubleValue);
        System.out.println("abs: " + absValue);

        /*
         * postfix and prefix incrementing
         * postfix output the value of 10 and reset it to 11
         * = Output: 10
         * New value: 11
         * 
         * Prefix executes the math and evaluates the value
         * = Output: 11
         * New value: 11
         */
        int intValue3 = 10;
        System.out.println(++intValue3);
        System.out.println(intValue3++);

        String s1 = "Hello";
        String s2 = "HellO";

        if (s1.equals(s2)) {
            System.out.println("Matched!!");

        } else {
            System.out.println("No match " + s1.isEmpty());
        }

    }
}