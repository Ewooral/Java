public class WhileLoopTrick {
    public static void main(String[] args) {

        int a;
        int b = 4;
        while ((a = 0) != b) {
            System.out.println(b);
            b--;
        }
        System.out.println(a);
    }
}
