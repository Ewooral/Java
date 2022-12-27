
public class Str_ReverseAString {

    private StringBuilder sb = new StringBuilder();

    public StringBuilder reverse(String ss) {
        String[] s = ss.split("");
        for (int i = s.length - 1; i != -1; i--) {
            sb.append(s[i]);
        }
        return sb;
    }

}

class TestArray {
    public static void main(String[] args) {
        Str_ReverseAString ra = new Str_ReverseAString();
        String s = "GOD";
        System.out.println(ra.reverse(s));
    }
}