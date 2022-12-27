// import java.lang.*;
public class BooleanClass {

    // unused variable
    static boolean boolMe;

    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = !b1;

        int i1 = 0;
        boolean b4 = (i1 != 0);

        // parsing a value
        String sBoolean = "true";
        String iNumber = "400";
        boolean parsed = Boolean.parseBoolean(sBoolean);
        int parsedNumber = Integer.parseInt(iNumber);

        System.out.println("b1 value: " + b1);
        System.out.println("b2 value: " + b2);
        System.out.println("boolean default value: " + boolMe);
        System.out.println("reversing b1 value: " + b3);
        System.out.println("comparing two value i1 and b4: " + b4);
        System.out.println("parsed: " + parsed);
        System.out.println("parsedInteger: " + parsedNumber);

    }

}