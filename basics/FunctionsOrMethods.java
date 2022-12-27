
public class FunctionsOrMethods {
    static String[] months = { "January", "February", "March",
            "April", "May", "June",
            "July", "August", "September",
            "October", "November", "December"
    };
    static int[] days = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

    public static void main(String[] args) {
        loopIt("Months of the year");
        getName("Elijah Owusu Boahen");
    }

    static void loopIt(String label) {
        System.out.println(label);
        for (int i = 0; i < label.length(); i++) {
            System.out.print("*");
        }
        System.out.println("");
        int i = 0;
        int j = 0;
        for (; i < months.length && j < days.length; i++, j++) {
            System.out.println(months[i] + " :" + days[j]);

        }
    }

    // METHOD 0R FUNCTION
    static void getName(String name) {
        System.out.println("My name is " + name);
    }
}
