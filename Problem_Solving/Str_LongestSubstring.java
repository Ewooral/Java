public class Str_LongestSubstring {
    public static void main(String[] args) {
        String[] ab = { "flower", "flow", "flight" };
        // String[] ac = { "dkeetd", "yfeetk", "lmketb" };
        String[] ad = { "dkeetd", "yfeetk", "lmketb" };

        System.out.println(longestCommonPrefix(ab));
        System.out.println(longestCommonPrefix(ad));
        System.out.println(longestCommonPrefixI(ab));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        return prefix;
    }

    public static String longestCommonPrefixI(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }

}
