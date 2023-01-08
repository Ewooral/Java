import java.util.Arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        multiDimensional();
        multi_D();
    }

    public static int[][] multiD = new int[3][5];

    static void multiDimensional() {

        for (int i = 1; i < multiD.length; i++) {
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

        if (((Object) k).getClass().getSimpleName().equals("Integer")) {
            System.out.println("Yesss!!");
        }

    }

}