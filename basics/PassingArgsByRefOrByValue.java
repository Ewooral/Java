
public class PassingArgsByRefOrByValue {
    public static void main(String[] args) {

        int orignal = 10;
        System.out.println("...........");
        System.out.println("Original before: " + orignal);
        incrementValue(orignal);
        // the orignal value remains the same after calling the increment function
        System.out.println("Original after: " + orignal);

        System.out.println("............");
        int[] arOriginal = { 10, 20, 30 };
        System.out.println("Original before: " + arOriginal[0]);
        incrementValue1(arOriginal);
        // the orignal value changes after calling the increment function
        System.out.println("Original after: " + arOriginal[0]);

        System.out.println("...............");
        String original = "Original";
        System.out.println("Original before: " + original);
        changString(original);
        // the orignal value remains same after calling the increment function. Strings
        // are immutable
        System.out.println("Original after: " + original);
    }
    /*
     * Are arguments passed into a method passed as a copy or by reference
     * 1. Arguments by copy:
     * You're passing a variable into a function or method
     * and inside the method, a copy of the variable is recieved. It is not
     * attached to the original value before it was passed in
     * 
     * 2. Arguments by reference:
     * This means you're referring to the original object. The object that
     * existed outside the method. Any changes made to the object within
     * the method affects the original value
     * 
     * NB. In java variables are always passed by copy.
     */

    // Passing Primitive values
    static void incrementValue(int inMethod) {
        inMethod++;
        System.out.println("In method: " + inMethod);
    }

    // Primitive wrapped in Objects
    static void incrementValue1(int[] inMethod) {
        inMethod[0]++;
        System.out.println("In method: " + inMethod[0]);
    }

    static void changString(String inMethod) {
        inMethod = "New!";
        System.out.println("In Method: " + inMethod);
    }
}
