import java.util.Arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        multiDimensional();
        System.out.println(".............");
        multi_D();
    }

    private static int[][] arr = { { 1, 2 }, { 3, 4 } };

    public static int[][] multiD = new int[3][5];

    static void multiDimensional() {

        for (int i = 0; i < multiD.length; i++) {
            System.out.println(Arrays.toString(multiD[i]));
        }
        System.out.println(multiD.getClass().getSimpleName());

        for (int i = 0; i < multiD.length; i++) {
            for (int j = 0; j < multiD.length; j++) {
                multiD[i][j] = (int) (Math.random() * 10);
            }

        }

        for (int[] arr : multiD) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();

        }

    }

    static void multi_D() {
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));

    }

}