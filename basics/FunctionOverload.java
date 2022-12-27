
import java.util.Scanner;

public class FunctionOverload {

    // this is the main method in which other methods are called
    public static void main(String[] args) {
        String s1 = getInput("Enter value 1: ");
        String s2 = getInput("Enter value 2: ");
        String s3 = getInput("Enter value 3: ");

        double result1 = addValues(s1, s2);
        double result2 = addValues(s1, s2, s3);
        double result3 = addValues(s1, s2, s3, s1, s2, s3);

        System.out.println("The answer for 2 values is: " + result1);
        System.out.println("The answer for 3 values is: " + result2);
        System.out.println("The answer for more values is: " + result3);

    }

    // a method to get user input
    static String getInput(String prompt) {
        System.out.println(prompt);
        try (Scanner scanner = new Scanner(System.in)) {
            return scanner.nextLine();
        }
    }

    // a method to add user inputs
    static double addValues(String S1, String S2) {
        double d1 = Double.parseDouble(S1);
        double d2 = Double.parseDouble(S2);
        double result = d1 + d2;
        return result;
    }

    static double addValues(String S1, String S2, String S3) {
        double d1 = Double.parseDouble(S1);
        double d2 = Double.parseDouble(S2);
        double d3 = Double.parseDouble(S3);
        double result = d1 + d2 + d3;
        return result;
    }

    static double addValues(String... values) {
        double result = 0;
        for (String value : values) {
            double d = Double.parseDouble(value);
            result += d;
        }
        return result;
    }

}
