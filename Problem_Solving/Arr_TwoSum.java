import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Arr_TwoSum {

    // [2, 4, 1, 3, 0, -2], target = 2,
    // find two numbers when added sum up to target.
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 4, -3, 1, 3, 0, -3, -2));
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(-1, -2, -3, -4, -5));
        twoSum(arr, 1);
        System.out.println("................");
        twoSum(arr1, -8);
        System.out.println("................");
        Solution s = new Solution();
        int[] ar = { -1, -2, -3, -4, -5 };
        int[] ans = s.twoSum(ar, -8);
        int[] ans1 = two_sum(ar, -8);
        for (int num : ans) {
            System.out.println(num);
        }
        System.out.println("................");
        for (int num : ans1) {
            System.out.println(num);
        }

    }

    static void twoSum(ArrayList<Integer> arr, int target) {
        for (int i = 0; i < arr.size(); i++) {
            int curNum = arr.get(i);

            for (int j = 1; j < arr.size(); j++) {
                int nextNum = arr.get(j);
                if (curNum + nextNum == target && i != j) {
                    System.out.println(new ArrayList<>(Arrays.asList(curNum, nextNum)));

                }
            }
        }

    }

    static int[] two_sum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }
}

class Solution {

    public int[] twoSum(int[] nums, int target) {

        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int curElem = nums[i];
            int lastElem = nums[j];
            if (curElem + lastElem > target) {
                j--;
            }
            if (curElem + lastElem < target) {
                i++;
            }
            if (i == j && curElem + lastElem < target) {
                j++;
            } else {
                if (curElem + lastElem == target) {
                    int[] idx = { i, j };
                    return idx;
                }

            }
        }
        int[] emptyArr = {};
        return emptyArr;
    }

    public int[] two_Sum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }

    public int[] TwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        // In case there is no solution, we'll just return null
        return null;
    }
}
