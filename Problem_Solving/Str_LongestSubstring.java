public class Str_LongestSubstring {

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int idx = strs[i].indexOf(prefix);
            while (idx != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        }

        return prefix;

    }

    public static String aab(String[] aa) {
        // String[] aa = { "abc", "def" };
        int i = 1;
        String curStr = aa[0];
        while (i < aa.length) {

            while (aa[i].indexOf(curStr) != 0) {
                curStr += curStr.substring(0, curStr.length() - 1);
            }
            if (curStr.isEmpty())
                return "";
        }
        return curStr;
    }

    public static void main(String[] args) {
        String[] aa = { "abc", "def" };
        String[] ab = { "flower", "flow", "flight" };
        // System.out.println(aab(aa));
        // System.out.println(aab(ab));
        // System.out.println(longestCommonPrefix(aa));
        System.out.println(longestCommonPrefix(ab));
    }
}
