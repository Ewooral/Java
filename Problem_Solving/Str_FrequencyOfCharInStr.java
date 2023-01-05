public class Str_FrequencyOfCharInStr {
    public static int freqOfChInStr(char ch, String s) {
        int count = 0;
        for (char cur : s.toCharArray()) {
            if (cur == ch) {
                count++;
            }
        }
        return count;
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

/**
 * int count = 0;
 * for (char cur : s.toCharArray()) {
 * if (cur == ch) {
 * if (map.containsKey(ch)) {
 * map.put(ch, ++count);
 * } else {
 * map.put(ch, count);
 * }
 * 
 * }
 * }
 * return map.get(ch) + 1;
 */