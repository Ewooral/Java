
public class CenteredArray {

    /*
     * An array with an odd number of elements is said to be centered if
     * all elements (except the middle one) are strictly greater than the value
     * of the middle element. Note that only arrays with an odd number of elements
     * have a middle element.
     * 
     * Write a function that accepts an integer array and
     * returns 1 if it is a centered array, otherwise it returns 0.
     * 
     * Examples:
     * if the input array is: return
     * {1, 2, 3, 4, 5} 0 (the middle element 3 is not strictly less than all other
     * elements)
     * {3, 2, 1, 4, 5} 1 (the middle element 1 is strictly less than all other
     * elements)
     * {3, 2, 1, 4, 1} 0 (the middle element 1 is not strictly less than all other
     * elements)
     * {1, 2, 3, 4} 0 (no middle element)
     * {} 0 (no middle element)
     * {10} 1 (the middle element 10 is strictly less than all other elements)
     * 
     */

    public static void main(String[] args) {
        System.out.println("..........................");
        int numbers[] = { 10 };
        int numbers1[] = { 3, 2, 1, 7, 5 }; // centered array
        int numbers2[] = { 1, 2, 3, 4, 5 };
        int numbers3[] = {};
        int numbers4[] = { 3, 2, 1, 4, 5 };

        int mini = (numbers.length > numbers1.length)
                ? numbers[0]
                : numbers1[0];
        System.out.println("Ternary in Java: " + mini);
        System.out.println("..........................");

        System.out.println(middleElemen(numbers));
        System.out.println("..........................");
        System.out.println(middleElemen(numbers1));
        System.out.println("..........................");
        System.out.println(middleElemen(numbers2));
        System.out.println("..........................");
        System.out.println(middleElemen(numbers3));
        System.out.println("..........................");
        System.out.println(middleElemen(numbers4));
        System.out.println("..........................");
        System.out.println(centeredArr(numbers));
        System.out.println(centeredArr(numbers1));
        System.out.println(centeredArr(numbers2));
        System.out.println(centeredArr(numbers3));
        System.out.println(centeredArr(numbers4));
    }

    public static int middleElemen(int[] arr) {
        int midIdx = (int) arr.length / 2;
        if (arr.length <= 0) {
            return 0;
        }

        for (int i = 0; i < arr.length; i++) {
            final int midElem = arr[midIdx];
            final int curElem = arr[i];
            if (arr.length % 2 == 0) {
                System.out.println("No middle element found!!");
                return 0;
            }
            if (arr.length % 2 == 1) {

                if (curElem == midElem) {
                    continue;

                } else if (curElem < midElem) {
                    return 0;
                } else {
                    continue;
                }
            }
        }

        return 1;
    }

    static int centeredArr(int[] a) {
        if (a == null || a.length % 2 == 0)
            return 0;
        int midIndex = a.length / 2;
        int middleItem = a[midIndex];
        for (int i = 0; i < a.length; i++) {
            if (i != midIndex && middleItem >= a[i])
                return 0;
        }
        return 1;
    }

}
