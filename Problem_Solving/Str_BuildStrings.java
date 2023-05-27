/**
 * 2466. Count Ways To Build Good Strings
 * Medium
 *
 * 
 * Given the integers zero, one, low, and high, we can construct a string by
 * starting with an empty string, and then at each step perform either of the
 * following:
 * 
 * Append the character '0' zero times.
 * Append the character '1' one times.
 * 
 * This can be performed any number of times.
 * 
 * A good string is a string constructed by the above process having a length
 * between low and high (inclusive).
 * 
 * Return the number of different good strings that can be constructed
 * satisfying these properties. Since the answer can be large, return it modulo
 * 109 + 7.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: low = 3, high = 3, zero = 1, one = 1
 * Output: 8
 * Explanation:
 * One possible valid good string is "011".
 * It can be constructed as follows: "" -> "0" -> "01" -> "011".
 * All binary strings from "000" to "111" are good strings in this example.
 * 
 * Example 2:
 * 
 * Input: low = 2, high = 3, zero = 1, one = 2
 * Output: 5
 * Explanation: The good strings are "00", "11", "000", "110", and "011".
 * 
 * 
 * 
 * Constraints:
 * 
 * 1 <= low <= high <= 105
 * 1 <= zero, one <= low
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * The algorithm uses an array dp to keep track of the number of good strings
 * that can be formed for each length up to the high value. The base case is
 * when dp[0] = 1, indicating that there is one good string of length zero.
 * 
 * The algorithm then iteratively fills in the rest of the dp array for all
 * lengths between min(zero, one) and high, inclusive. For each length i, the
 * algorithm considers two cases:
 * 
 * The number of 0 digits is at least zero: In this case, the algorithm adds the
 * number of good strings of length i - zero to dp[i].
 * The number of 1 digits is at least one: In this case, the algorithm adds the
 * number of good strings of length i - one to dp[i].
 * 
 * Finally, the algorithm computes the sum of the dp array elements for lengths
 * between low and high, inclusive, and returns this sum as the result.
 * 
 */

public class Str_BuildStrings {

    public Str_BuildStrings() {

    }

    public static void main(String[] args) {
        System.out.println(countGoodStrings(2, 3, 1, 2));
        System.out.println(countGoodStrings(3, 3, 1, 1));
    }

    public static int countGoodStrings(int low, int high, int zero, int one) {
        int[] dp = new int[high + 1];
        dp[0] = 1;
        int md = 1000000007;
        for (int i = Math.min(zero, one); i <= high; i++) {
            if (i >= zero) {
                dp[i] = (dp[i] + dp[i - zero]) % md;
            }
            if (i >= one) {
                dp[i] = (dp[i] + dp[i - one]) % md;
            }
        }
        int sum = 0;
        for (int i = low; i <= high; i++) {
            sum = (sum + dp[i]) % md;
        }
        return sum;
    }

}