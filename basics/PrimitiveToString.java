
import java.text.NumberFormat;

public class PrimitiveToString {
    public static void main(String[] args) {

        // from integer to string
        int intValue = 42;
        String fromInt = Integer.toString(intValue);
        System.out.println("from integer to string: " + fromInt);

        // from boolean to string
        boolean boolValue = true;
        String fromBool = Boolean.toString(boolValue);
        System.out.println("from boolean to string: " + fromBool);

        // from long to string
        long longValue = 10_000_000;
        NumberFormat formatter = NumberFormat.getNumberInstance();
        String formatted = formatter.format(longValue);
        System.out.println("from long to string: " + formatted);
    }
}
