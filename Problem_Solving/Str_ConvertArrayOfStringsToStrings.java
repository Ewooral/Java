
public class Str_ConvertArrayOfStringsToStrings {
    public static void main(String[] args) {
        String[] s = { "Java", "is", "cool" };
        stringArrayToString(s);
    }

    public static void stringArrayToString(String[] s) {
        String m = String.join(" ", s);
        System.out.println(m);
    }
}
