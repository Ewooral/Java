
public class ConvertingNumericValues {
    public static void main(String[] args) {
        int intValue1 = 56;
        int intValue2 = intValue1;
        System.out.println("First Value: " + intValue1);
        System.out.println("Second Value: " + intValue2);

        /*
         * converting a small value to a big value (Widening)
         * Here, casting type name to the variable is not needed since
         * Java engine automatically allocates memory for the new value
         * The same cannot be said about Narrowing.
         */

        long longValue1 = intValue1;
        System.out.println("long Value is: " + longValue1);

        /*
         * converting a big value to a small (Narrowing)
         * casting type to the variable is mandatory to avoid errors
         */

        short shortValue1 = (short) intValue1;
        System.out.println("short Value is: " + shortValue1);

        int intValue3 = 256;
        byte byteValue = (byte) intValue3;
        System.out.println("byte Value is: " + byteValue);

        double dValue = 3.2333444d;
        int newDValue = (int) dValue;
        System.out.println("dValue Value is: " + newDValue);
    }

}
