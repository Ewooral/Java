
import java.text.NumberFormat;
import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
        stringTutorials();
    }

    // Maninpulate Strings
    public static void stringTutorials() {
        String str1 = "Coders";
        String str2 = "abode";
        String str3 = str1 + ", " + str2 + "! ";

        System.out.println(str3);
        /**
         * You can build a string like this but
         * see that we've created a 3 objects.
         * To manage our memory efficiently, we gonna
         * use the StringBuilder Class
         */

        // Now instead of 3 objects we created only one
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", ");
        sb.append("World");
        sb.append("! ");
        sb.reverse();
        System.out.println("character at 0: " + sb.charAt(0));

        System.out.println(sb);
        // or
        StringBuilder newSb = new StringBuilder("Mango")
                .append("is ")
                .append("Sweet")
                .append("!");
        System.out.println(newSb);

        // // lets combine Scanner and StringBuilder classes

        // try (Scanner scanner = new Scanner(System.in)) {
        // System.out.println("Enter value: ");
        // String input = scanner.nextLine();
        // System.out.println(input);

        // newSb.delete(0, newSb.length());

        // for (int i = 0; i < 3; i++) {
        // input = scanner.nextLine();
        // newSb.append(input + "\n");
        // }
        // System.out.println();
        // System.out.println(newSb);

        // }

        // Lets compare strings
        String Str1 = "Hello";
        String Str2 = "Hello";
        if (Str1.equals(Str2)) {
            System.out.println("Matched!");
        } else {
            System.out.println("They don't match!");
        }

        // Formatting numeric values as strings
        Locale locale = new Locale("da", "GH");

        double doubleV = 1_234_567.89;

        NumberFormat numF = NumberFormat.getNumberInstance(locale);
        System.out.println("Number: " + numF.format(doubleV));

        NumberFormat curF = NumberFormat.getCurrencyInstance(locale);
        System.out.println("Currency: " + curF.format(doubleV));

        NumberFormat intF = NumberFormat.getIntegerInstance(locale);
        System.out.println("Currency: " + intF.format(doubleV));

        // Parsing a String
        String myS1 = "Welcome to Tema Accra!";
        System.out.println("last index of c: " + myS1.lastIndexOf("c"));
        System.out.println("length of string: " + myS1.length());

        int position = myS1.indexOf("c", 16);
        System.out.println("Position of string c from index 16: " + position);

        String substring = myS1.substring(7, 14);
        System.out.println("substring: " + substring);

        String myS2 = "Welcome        ";
        int length1 = myS2.length();
        System.out.println("Length of raw string identifier: " + length1);
        String myS3 = myS2.trim();
        System.out.println("Length of string identifier after trimming: " + myS3.length());

        System.out.println("..........String methods..........");
        String s = "dukeprogramming";
        System.out.println(s.indexOf("g"));
        System.out.println(s.indexOf("g", 8));
        System.out.println(s.startsWith("duke", 1)); // false because start of search is from index 1
        System.out.println(s.endsWith("g"));
        System.out.println(s.equalsIgnoreCase("DUKEPROGRAMMING"));

        // first three substrings in a string
        System.out.println("......first three substrings......");
        firstThreeSubString(s);
        reverseStr("God is King Forever!");
    }

    public static void firstThreeSubString(String s) {
        int i = 0;
        int j = 0;

        String sub3 = s.substring(i, j + 3);
        System.out.println(sub3);
    }

    public static void reverseStr(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sa = new StringBuilder();
        sb.append(s);
        sb.reverse();
        System.out.println(sb);

        for (int i = s.length() - 1; i > -1; i--) {
            sa.append(s.charAt(i));
        }
        System.out.println(sa);
    }
}
