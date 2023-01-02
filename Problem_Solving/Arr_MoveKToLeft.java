import java.util.ArrayList;
import java.util.Arrays;

public class Arr_MoveKToLeft {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(0, 2, 0, -1, 8, 0));
        System.out.println(moveToLeft(arr, 0));
    }

    static ArrayList<Integer> moveToLeft(ArrayList<Integer> arr, int k) {
        // 0, 2, 0, -1, 8, 0
        int i = 0;
        int j = arr.size() - 1;
        while (i < j) {
            while (i < j && arr.get(j) == k) {
                j--;
            }
            // if (arr.get(i) == k) {
            // int left = arr.get(i);
            // int right = arr.get(j);
            // arr.set(i, right);
            // arr.set(j, left);
            // }
            while (arr.get(i) == k) {
                int left = arr.get(i);
                int right = arr.get(j);
                arr.set(i, right);
                arr.set(j, left);
            }
            i++;
        }
        return arr;
    }
}
