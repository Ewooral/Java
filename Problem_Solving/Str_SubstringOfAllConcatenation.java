import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

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
    private String[] resIdx;
    private int[] idx;
    private int trackIdx = 0;
    private ArrayList<Integer> arrayList = new ArrayList<>();
    private HashMap<Integer, String> map = new HashMap<>();

    public Str_SubstringOfAllConcatenation(String S, String[] Arr) {
        this.s = S;
        this.arr = Arr;
    }

    public ArrayList<Integer> subOfAllConcat() {
        // public String subOfAllConcat() {
        String ss = this.s;
        int arrLength = String.join("", this.arr).length();
        int m = arrLength;
        int alloSpace = ss.length() + 1 - m;
        // resIdx = new String[alloSpace];
        int q = 0;
        int s = 0;
        String subString = "";

        while (q < alloSpace) {
            subString = ss.substring(q, arrLength);
            q++;
            arrLength++;

            String[] arrayStrings = this.arr.clone();

            int count = 0;

            for (int i = 0; i < arrayStrings.length; i++) {
                String arrString = arrayStrings[i];

                int length = arrString.length(), a = 0;
                int b = length;

                // if (map.containsValue(arrString)) {
                // break;
                // }
                // map.put(i, arrString);

                for (int j = 0; j < arrayStrings.length; j++) {
                    String firstStr = subString.substring(a, b);

                    if (firstStr.equals(arrString)) {
                        arrayStrings[i] = "";
                        break;
                    }
                    a += length;
                    b += length;
                }

            }
            boolean isEmptyStrings = true;
            for (int p = 0; p < arrayStrings.length; p++) {
                if (arrayStrings[p] != "") {
                    isEmptyStrings = false;
                    break;
                } else {
                    isEmptyStrings = true;
                }
            }
            if (!isEmptyStrings) {
                continue;
            } else {
                // count++;
                // idx = new int[count];
                int index = this.s.indexOf(subString, s);
                s++;
                arrayList.add(index);
                // idx[trackIdx] = index;
                // trackIdx++;
                System.out.println(ss.indexOf(subString, index));
                arrayStrings = this.arr.clone();
            }
        }
        return arrayList;
        // return Arrays.toString(resIdx);
    }

    public static void main(String[] args) {
        String ss = "wordgoodgoodgoodbestword";
        String[] words = { "word", "good", "best", "word" };
        String s1 = "barfoofoobarthefoobarman";
        String s = "bafobafoba";
        String[] sArr = { "ba", "fo", };
        String[] sArr1 = { "bar", "foo", "the" };
        String s2 = "barfoothefoobarman";
        String[] words2 = { "foo", "bar" };

        Str_SubstringOfAllConcatenation substr = new Str_SubstringOfAllConcatenation(s, sArr);
        Str_SubstringOfAllConcatenation substr1 = new Str_SubstringOfAllConcatenation(s1, sArr1);
        Str_SubstringOfAllConcatenation substr2 = new Str_SubstringOfAllConcatenation(ss, words);
        Str_SubstringOfAllConcatenation substr3 = new Str_SubstringOfAllConcatenation(s2, words2);
        // Str_SubstringOfAllConcatenation substr1 = new
        // Str_SubstringOfAllConcatenation(ss, words);
        // System.out.println(substr.subOfAllConcat());
        System.out.println("..........................................");
        System.out.println(substr1.subOfAllConcat());

        System.out.println("..........................................");
        System.out.println(substr2.subOfAllConcat());

        // System.out.println("..........................................");
        // System.out.println(substr3.subOfAllConcat());

    }
}
