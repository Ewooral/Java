
public class primitiveVariables {

    public static void main(String[] args) {
        byte b = 1;
        short sh = 1;
        int i = 1;
        long l = 1L;
        float f = 1.0f;
        double d = 1d;
        System.out.println("Byte:" + b);
        System.out.println("Short:" + sh);
        System.out.println("Integer:" + i);
        System.out.println("Float:" + f);
        System.out.println("Double:" + d);
        System.out.println("Long:" + l);
        System.out.println("............");

        double doubleValue = 138.0d;
        Double doubleObj = Double.valueOf(doubleValue); // instance of the Double helper class

        /**
         * to convert one data type to another, create an instance of the data type
         * E.g. double doubleValue = 128.0d;
         * Double doubleObj = Double.valueOf(doubleValue);
         * Now convert it to another datatype like this:
         * byte byteValue = doubleObj.byteValue();
         * 
         */
        int singleNumber = 120;
        Integer singleObj = Integer.valueOf(singleNumber);
        float floatObj = singleObj.floatValue();
        byte byteObj = singleObj.byteValue();
        System.out.println("Byte Value: " + byteObj);
        System.out.println("float Value:  " + floatObj);
        System.out.println("Single Obj: " + singleObj);

        byte byteValue = doubleObj.byteValue();
        int intValue = doubleObj.intValue();
        // float floatValue = doubleObj.floatValue();
        short shortValue = doubleObj.shortValue();
        // long longValue = doubleObj.longValue();
        String stringValue = doubleObj.toString();

        if (doubleValue < Byte.MAX_VALUE) {
            byteValue++;
        }
        System.out.println("byte value first:" + byteValue);

        System.out.println("byte value:" + byteValue);
        System.out.println("short value:" + shortValue);
        System.out.println("string value:" + stringValue);
        System.out.println("integer value:" + intValue);
    }
}
