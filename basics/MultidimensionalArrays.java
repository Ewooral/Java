import java.util.Arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        multiDimensional();
        multi_D();
    }

    private static int[][] arr = { { 1, 2 }, { 3, 4 } };

    public static int[][] multiD = new int[3][5];

    static void multiDimensional() {
        multiD[0][0] = 12;
        multiD[0][1] = 5;
        multiD[0][2] = 9;

        for (int i = 0; i < multiD.length; i++) {
            System.out.println(Arrays.toString(multiD[i]));
        }
        System.out.println(multiD.getClass().getSimpleName());

    }

    static void multi_D() {
        int k = 34;
        Integer.toString(k);
        System.out.println(k);
        System.out.println(Integer.toString(k));

        String s = "24";
        int t = 2;
        System.out.println(Integer.parseInt(s) + t);
        System.out.println(s.getClass().getSimpleName());
        System.out.println(((Object) k).getClass().getSimpleName());

        // check if a primitive type is an Integer
        if (((Object) k).getClass().getSimpleName().equals("Integer")) {
            System.out.println("Yesss!!");
        }
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));

    }

}