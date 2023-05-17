import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
    private List<Integer> arrayList = new ArrayList<>();
    // private HashMap<Integer, String> map = new HashMap<>();
    private HashMap<String, Integer> map2 = new HashMap<>();
    private HashMap<String, Integer> map3 = new HashMap<>();
    private String[] strArr;

    public Str_SubstringOfAllConcatenation(String S, String[] Arr) {
        this.s = S;
        this.arr = Arr;
    }

    public List<Integer> subOfAllConcat() {
        String ss = this.s;
        int arrLength = String.join("", this.arr).length();
        int m = arrLength;
        int pp = m;
        int allocatedSpace = ss.length() + 1 - m;
        int allo = allocatedSpace;
        int q = 0, r = 0;
        // int s = 0;
        while (q < allocatedSpace) {
            // this gets the frequency of word in the array of strings
            strArr = new String[allocatedSpace];
            while (r < allo) {
                String subString = ss.substring(r, pp);
                strArr[r] = subString;
                r++;
                pp++;
            }
            for (String w : strArr) {
                map3.put(w, map3.getOrDefault(w, 0) + 1);
            }
            for (String word : this.arr) {
                map2.put(word, map2.getOrDefault(word, 0) + 1);
            }

        }
        return arrayList;
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
        String w = "wordgoodgoodgoodbestword";
        String[] wArr = { "word", "good", "best", "good" };

        Str_SubstringOfAllConcatenation substr = new Str_SubstringOfAllConcatenation(s, sArr);
        Str_SubstringOfAllConcatenation substr1 = new Str_SubstringOfAllConcatenation(s1, sArr1);
        Str_SubstringOfAllConcatenation substr2 = new Str_SubstringOfAllConcatenation(ss, words);
        Str_SubstringOfAllConcatenation substr3 = new Str_SubstringOfAllConcatenation(s2, words2);
        Str_SubstringOfAllConcatenation substr4 = new Str_SubstringOfAllConcatenation(w, wArr);

        System.out.println(substr.subOfAllConcat());
        System.out.println("..........................................");
        System.out.println(substr1.subOfAllConcat());

        System.out.println("..........................................");
        System.out.println(substr2.subOfAllConcat());

        System.out.println("..........................................");
        System.out.println(substr3.subOfAllConcat());

        System.out.println("..........................................");
        System.out.println(substr4.subOfAllConcat());

    }
}
/**
 * CODE EXPLANATION
 * 1. I found all subarray occurences in the string which are of length N.
 * ==>>>"barfoothefoobarman"
 * 
 * "N" is the length the concatenation of the array of strings
 * { "foo", "bar" } => "foobar" => 6
 * 
 * 2. So at each subarray "barfoo", we get the substring of length ("foo")
 * in the string array
 * 
 */