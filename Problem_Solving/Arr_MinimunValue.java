public class Arr_MinimunValue {
    public static void main(String[] args) {
        int[] arr = { 2, -9, 4, 1, -4, 5, 0 };
        System.out.println(miniValue(arr));
        System.out.println(maxValue(arr));
    }

    public static int miniValue(int[] arr) {
        // [2,-9, 4, 1, -4, 5, 0]
        int j = 1;
        int mini = arr[0];
        while (j < arr.length) {
            int curV = arr[j];
            if (curV < mini) {
                mini = curV;
            }
            j++;
        }
        return mini;
    }

    public static int maxValue(int[] arr) {
        int j = 1;
        int maxi = arr[0];
        while (j < arr.length) {
            int curV = arr[j];
            if (curV > maxi) {
                maxi = curV;
            }
            j++;
        }
        return maxi;

    }
}
