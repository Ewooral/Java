
import java.util.Scanner;

/**
 * create a console that takes a user input
 * translates strings to numeric value
 * performs an arithmetic operation and
 * displays the result in the console
 */

public class SimpleCalculator {
    public static boolean isDone;

    public static void main(String[] args) throws Exception {

        while (isDone == false) {
            String s1 = getInput("Enter a numeric value: ");
            String s2 = getInput("Enter a numeric value: ");

            // boolean isDone;

            // isDone = true;
            String op = getInput("Choose an operation (+ - * /): ");

            double result;

            try {
                if (op.equals("+")) {
                    result = addValues(s1, s2);
                    System.out.println("The answer is " + result);
                    isDone = true;
                }

                else if (op.equals("-")) {
                    result = subtractValues(s1, s2);
                    System.out.println("The answer is " + result);
                    isDone = true;
                }

                else if (op.equals("*")) {
                    result = multiplyValues(s1, s2);
                    System.out.println("The answer is " + result);
                    isDone = true;
                }

                else if (op.equals("/")) {
                    result = divideValues(s1, s2);
                    System.out.println("The answer is " + result);
                    isDone = true;
                } else {
                    System.out.println();
                    System.out.println("Wrong input! Try again.");
                }

            } catch (Exception e) {
                System.out.println("Number formatting exception " + e.getMessage());
            }
        }
    }

    public static String getInput(String prompt) {
        System.out.print(prompt);
        try (Scanner sc = new Scanner(System.in)) {
            return sc.nextLine();
        }

    }

    public static double addValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 + d2;
    }

    public static double subtractValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 - d2;
    }

    public static double multiplyValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 * d2;
    }

    public static double divideValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 / d2;
    }

}
