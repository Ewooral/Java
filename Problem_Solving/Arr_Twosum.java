package Problem_Solving;

import java.util.ArrayList;
import java.util.Arrays;

public class Arr_Twosum {

    // [2, 4, 1, 3, 0, -2], target = 2,
    // find two numbers when added sum up to target.
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 4, -3, 1, 3, 0, -3, -2));
        twoSum(arr);

    }

    static void twoSum(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            int curNum = arr.get(i);

            for (int j = 1; j < arr.size(); j++) {
                int nextNum = arr.get(j);
                if (curNum + nextNum == 1 && i != j) {
                    System.out.println(new ArrayList<>(Arrays.asList(curNum, nextNum)));

                }
            }
        }

    }

}
