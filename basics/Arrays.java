
/**
 * An array is a container object that holds a fixed number of values of a
 * single type
 */

public class Arrays {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 4, 2, 0 };

        // Array length
        System.out.println(nums.length);

        // looping thru an array with index
        for (int i = 0; i < nums.length; i++) {
            System.out.println(i + " : " + nums[i]);
        }

        System.out.println("..........");
        // looping thru an array without index
        for (int j : nums) {
            if (j == 4 || j == 2) {
                continue;
            }
            System.out.println("Nums: " + j);
        }

        // calling the school method
        schools();

    }

    static void schools() {

        // An array of integers school that takes max input of 5
        int[] school = new int[5];
        school[0] = 12;
        school[1] = 24;
        school[2] = 36;
        school[3] = 48;
        school[4] = 60;

        // 2nd array of primitive type integers
        int[] schools = { 1, 3, 4, 6 };
        System.out.println(schools[3]);
        System.out.println(school[4]);

        // array of complex object strings that takes a maximum of 3 elements
        String[] names = new String[3];
        names[0] = "Dickson";
        names[2] = "Kwaku";
        System.out.println(names[2]);

        // an array of primitive type boolean
        boolean[] wishes = { true, false, false, true };
        System.out.println(wishes[3]);

        // a two dimentional array of strings
        String[][] namess = {
                { "Mr. ", "Mrs. ", "Ms. " },
                { "Smith", "Jones" }
        };
        // Mr. Smith
        System.out.println(namess[0][0] + namess[1][0]);
        // Ms. Jones
        System.out.println(namess[0][2] + namess[1][1]);

        /*
         * Copying Arrays
         * ...................
         * public static void arraycopy(Object src, int srcPos, Object dest, int
         * destPos, int length)
         */
        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };

        String[] copyTo = new String[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");
        }

    }

}
