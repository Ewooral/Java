public class Str_LongestSubstring {

    public static void aab(String[] aa) {
        // String[] aa = { "abc", "def" };
        int i = 0;
        int j = i + 1;
        String subString = "";
        int k = 0;
        String curStr = aa[i];
        while (i < aa[k].length()) {
            String nextStr = aa[j];
            char cur = curStr.charAt(i);
            char nex = nextStr.charAt(i);
            while (j < aa.length) {
                if (cur == nex) {
                    // j++;
                } else {
                    i++;
                }
            }
            //
            // char cur = curStr.charAt(k);
            // char nex = nextStr.charAt(k);
            // if (cur == nex) {
            // j++;
            // } else {
            // k++;
            // }

            // while (k < curStr.length()) {
            subString += aa[i].charAt(i);

            // }
            // i++;
        }

    }

    public static void main(String[] args) {
        String[] aa = { "abc", "def" };
        String[] ab = { "flower", "flow", "flight" };
        aab(ab);
        aab(aa);
    }
}
