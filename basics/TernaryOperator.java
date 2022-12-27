
public class TernaryOperator {
    public static void main(String[] args) {
        System.out.println(sayHello("CM"));
        System.out.println(valueOf(true));
    }

    static String sayHello(String args) {
        String greet = args == "AM" ? "Good Morning"
                : args == "PM" ? "Good Evening"
                        : "Good Night";
        return greet;
    }

    public static Boolean valueOf(boolean b) {

        // int[] arr = {};

        return b ? Boolean.TRUE : Boolean.FALSE;
    }
}
