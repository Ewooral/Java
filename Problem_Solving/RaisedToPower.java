
public class RaisedToPower {
    public static void main(String[] args) {
        System.out.println(Math.pow(2, 3));
        System.out.println(powOf(2, 3));
    }

    public static int powOf(int base, int pow) {
        int res = 1;
        for (int expo = pow; expo != 0; expo--) {
            res *= base;
        }
        return res;
    }
}