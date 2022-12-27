
import java.util.HashMap;

public class Str_FrequencyOfCharInStr {
    private static HashMap<Character, Integer> map = new HashMap<>();

    public static int freqOfChInStr(char ch, String s) {
        String[] arrStr = s.split("");
        int count = 0;

        for (int i = 0; i < arrStr.length; i++) {
            char cur = s.charAt(i);
            if (cur == ch) {
                if (map.containsKey(ch)) {
                    map.put(ch, ++count);
                } else {
                    map.put(ch, count);
                }

            }
        }
        return map.get(ch) + 1;

    }

    public static void main(String[] args) {
        /**
         * Given a String and a character return how many times the given character is
         * present in that string.
         */

        String s = "o0o12oo";
        char ch = 'o';
        System.out.println(freqOfChInStr(ch, s));

    }
}
