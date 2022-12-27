
import java.math.BigDecimal;

public class BigDecimals {
    public static void main(String[] args) {
        double value = 0.012d;
        double pSum = value + value + value;
        System.out.println(pSum);

        // Inconsistencies in adding double value
        // necessitate the use of BigDecimals.
        // This is very essential in currency conversion
        // To use BigDecimals on a number, we need to convert it to a string

        String strValue = Double.toString(value);
        System.out.println("strValue: " + strValue);

        BigDecimal bigValue = new BigDecimal(strValue);
        System.out.println("BigValue: " + bigValue);

        BigDecimal bSum = bigValue.add(bigValue).add(bigValue);

        System.out.println("Sum of BigDecimals: " + bSum.toString());

    }
}
