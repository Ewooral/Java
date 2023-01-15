import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

/**
 * APPROACH
 * You can use a sliding window approach to solve this problem. First,
 * initialize a map to store the frequency of each word in the words array.
 * Then, iterate through the s string with a window of size n * len(words[0]),
 * where n is the length of the words array and len(words[0]) is the length of
 * the first word in the array. For each iteration, check if the current
 * substring in the window is a concatenation of the words in the words array by
 * comparing the frequency of each word in the substring to the frequency in the
 * map. If they match, add the starting index of the substring to the result
 * list. Here's an example function that demonstrates this approach:
 */

public class Str_substringOfAllConcat {
    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        int n = words.length;
        int len = words[0].length();
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (int i = 0; i <= s.length() - n * len; i++) {
            Map<String, Integer> seen = new HashMap<>();
            int j = 0;
            for (; j < n; j++) {
                int k = i + j * len;
                String sub = s.substring(k, k + len);
                if (!map.containsKey(sub)) {
                    break;
                }
                seen.put(sub, seen.getOrDefault(sub, 0) + 1);
                if (seen.get(sub) > map.get(sub)) {
                    break;
                }
            }
            if (j == n) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        String[] words = { "foo", "bar" };
        String ss = "wordgoodgoodgoodbestword";
        String[] wordsS = { "word", "good", "best", "word" };
        String s1 = "barfoofoobarthefoobarman";
        String sS = "bafobafoba";
        String[] sArr = { "ba", "fo", };
        String[] sArr1 = { "bar", "foo", "the" };

        List<Integer> result = findSubstring(s, words);
        List<Integer> result1 = findSubstring(sS, sArr);
        List<Integer> result2 = findSubstring(s1, sArr1);
        List<Integer> result3 = findSubstring(ss, wordsS);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}