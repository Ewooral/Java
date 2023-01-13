import java.util.Arrays;

public class Str_SubstringOfAllConcatenation {
    /**
     * # SUBSTRING WITH CONCATENATION OF ALL WORDS
     * Hard
     * 
     * You are given a string s and an array of strings words of the same length.
     * Return all starting indices of substring(s) in s that is a concatenation
     * of each word in words exactly once, in any order, and without any intervening
     * characters.
     * You can return the answer in any order.
     * 
     * 
     * Example 1:
     * 
     * Input: s = "barfoothefoobarman", words = ["foo","bar"]
     * Output: [0,9]
     * Explanation: Substrings starting at index 0 and 9 are "barfoo" and "foobar"
     * respectively.
     * The output order does not matter, returning [9,0] is fine too.
     * 
     * Example 2:
     * 
     * Input: s = "wordgoodgoodgoodbestword", words = ["word","good","best","word"]
     * Output: []
     * 
     * Example 3:
     * 
     * Input: s = "barfoofoobarthefoobarman", words = ["bar","foo","the"]
     * Output: [6,9,12]
     * 
     * Constraints:
     * 
     * ALGORITHM
     * 1. GET THE "N" strings IN STRING "S" EQUAL TO "ARR" LENGTH
     * 
     */
    private String s;
    private String[] arr;

    public Str_SubstringOfAllConcatenation(String S, String[] Arr) {
        this.s = S;
        this.arr = Arr;
    }

    public String subOfAllConcat() {
        String[] substr = getAllSubstringInArray();
        String[] arrayStrings = this.arr;
        String firstSubstr = "";
        for (int i = 0; i < substr.length; i++) {
            String arrString = arrayStrings[i];
            firstSubstr += substr[i];
            for (int j = 0; j < arrayStrings.length; j++) {

                String subString = firstSubstr.substring(i, arrString.length());

                if (arrString.equals(subString)) {
                    firstSubstr = firstSubstr.replace(subString, "");
                    System.out.println("Yes!");
                }
            }
        }
        return Arrays.toString(substr);
    }

    public String[] getAllSubstringInArray() {
        String ss = this.s;
        int arrLength = String.join("", this.arr).length();
        String[] array = new String[ss.length() / arrLength];
        int i = 0;
        int k = 0;
        while (!ss.isEmpty() && ss.length() >= arrLength) {
            String substr = ss.substring(i, arrLength);
            array[k] = substr;
            ss = ss.replace(substr, "");
            k++;
        }

        return array;
    }

    public static void main(String[] args) {
        String ss = "wordgoodgoodgoodbestword";
        String[] words = { "word", "good", "best", "word" };
        String s = "barfoofoobarthefoobarman";
        String[] sArr = { "bar", "foo", "the" };
        // System.out.println(String.join("", sArr));

        Str_SubstringOfAllConcatenation substr = new Str_SubstringOfAllConcatenation(s, sArr);
        Str_SubstringOfAllConcatenation substr1 = new Str_SubstringOfAllConcatenation(ss, words);
        System.out.println(substr.subOfAllConcat());
        System.out.println(substr1.subOfAllConcat());
    }
}
