package Search_Algorithms;

public class BinarySearch {

    public static int bSearch(int[] arr, int key) {
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            int mid = (hi + lo) / 2;
            if (key < arr[mid])
                return hi = mid - 1;
            else if (key > arr[mid])
                return lo = mid + 1;
            else
                return mid;
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] a = { 2, 3, 1, 0, 9, 7 };
        int key = 0;
        System.out.println(bSearch(a, key));
    }
}
