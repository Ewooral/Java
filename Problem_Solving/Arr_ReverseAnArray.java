import java.util.*;

public class Arr_ReverseAnArray {
    /**
     * Given an array, the task is to reverse the given array in Java.
     * 
     * Examples: 
     * 
     * Input : 1, 2, 3, 4, 5
     * Output :5, 4, 3, 2, 1
     * 
     * Input : 10, 20, 30, 40
     * Output : 40, 30, 20, 10
     */

    ArrayList<Integer> reversed = new ArrayList<Integer>();

    public ArrayList<Integer> reverseArray(Integer[] arr) {
        for (int i = arr.length - 1; i != -1; i--) {
            int lastElem = arr[i];
            reversed.add(lastElem);
        }
        return reversed;

    }

    // using Collection.reverse()
    public void reverse(Integer a[]) {
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));

    }

}

class Test {
    public static void main(String[] args) {
        Arr_ReverseAnArray ar = new Arr_ReverseAnArray();
        Integer[] input = { 1, 2, 3, 4, 5 };
        System.out.println(ar.reverseArray(input));
        ar.reverse(input);

        // Search for letter 3 in input using binary search
        Integer Idx = Arrays.binarySearch(input, 3);
        System.out.println(input[Idx]);

    }
}