import java.util.HashMap;
import java.util.Map;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D
 * and M.
 * 
 * Symbol Value
 * I 1
 * V 5
 * X 10
 * L 50
 * C 100
 * D 500
 * M 1000
 * 
 * For example, 2 is written as II in Roman numeral, just two ones added
 * together. 12 is written as XII, which is simply X + II. The number 27 is
 * written as XXVII, which is XX + V + II.
 * 
 * Roman numerals are usually written largest to smallest from left to right.
 * However, the numeral for four is not IIII. Instead, the number four is
 * written as IV. Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX. There
 * are six instances where subtraction is used:
 * 
 * I can be placed before V (5) and X (10) to make 4 and 9. 
 * X can be placed before L (50) and C (100) to make 40 and 90. 
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * 
 * Given a roman numeral, convert it to an integer.
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: s = "III"
 * Output: 3
 * Explanation: III = 3.
 * 
 * Example 2:
 * 
 * Input: s = "LVIII"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 * 
 * Example 3:
 * 
 * Input: s = "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 * 
 *  
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 15
 * s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
 * It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 * 
 * 
 */

public class RomanToInteger {

    static Map<String, Integer> strToInt = new HashMap<>();
    static Map<String, Integer> ROMAN_NUMERALS = new HashMap<>();
    private static int sumTotal = 0;

    public static int romanToInt(String s) {

        strToInt.put("I", 1);
        strToInt.put("V", 5);
        strToInt.put("X", 10);
        strToInt.put("L", 50);
        strToInt.put("C", 100);
        strToInt.put("D", 500);
        strToInt.put("M", 1000);

        // ICDL = I + C + D + L = 651

        for (int i = 0; i < s.length(); i++) {
            String str = Character.toString(s.charAt(i));
            String nextStr = Character.toString(s.charAt(i + 1));

            if (strToInt.containsKey(str)) {
                if (strToInt.get(str) < strToInt.get(nextStr)) {
                    sumTotal = strToInt.get(nextStr) - strToInt.get(str);
                    if (nextStr == "V") {
                        continue;
                    }
                } else {
                    sumTotal += strToInt.get(str);
                }

            }
        }

        return sumTotal;

    }

    public static int RomanToInt(String s) {
        int ans = 0, num = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
            }
            if (4 * num < ans)
                ans -= num;
            else
                ans += num;
        }
        return ans;
    }

    public static void main(String[] args) {
        // System.out.println(romanToInt("IIIV"));
        System.out.println(RomanToInt("IX"));
    }
}
