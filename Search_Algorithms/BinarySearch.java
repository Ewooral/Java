package Search_Algorithms;

public class BinarySearch {
    public static int bSearch(int[] arr, int key) {
        int lo = 0;
        int hi = arr.length - 1;
        // sort array first
        sortArray(arr);
        while (lo <= hi) {
            int mid = (hi + lo) / 2;
            int guess = arr[mid];
            if (guess == key)
                return key;
            else if (guess > key)
                hi = mid - 1;
            else
                lo = mid + 1;
        }
        return -1;
    }

    public static int[] sortArray(int[] arr) {
        int i = 0;
        int j = i + 1;
        while (i < arr.length) {
            while (j < arr.length) {
                if (arr[i] < arr[j]) {
                    j++;
                } else if (arr[i] > arr[j]) {
                    int curElem = arr[i];
                    int nextElem = arr[j];
                    arr[i] = nextElem;
                    arr[j] = curElem;

                }
            }
            i++;
            j = i + 1;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] a = { 2, 3, 1, 0, 9, 7, -4 };
        int key = 0;
        System.out.println(bSearch(a, key));

    }
}
