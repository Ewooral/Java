/**
 * Given an integer x, return true if x is a
 * palindrome , and false otherwise.
 * 
 * An integer is a palindrome when it reads the same forward and backward.
 * For example, 121 is a palindrome while 123 is not.
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * 
 * Example 2:
 * 
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it
 * becomes 121-. Therefore it is not a palindrome.
 * 
 * Example 3:
 * 
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * 
 *  
 * 
 * Constraints:
 * 
 * -231 <= x <= 231 - 1
 * 
 *  
 * Follow up: Could you solve it without converting the integer to a string?
 */

public class is_Palindrome {
    public static void main(String[] args) {

    }

    public static boolean is_palindrome(int pal) {
        String s = Integer.toString(pal);
        char[] ch = s.toCharArray();
        String.join(",", s);
        for (int i = 0; i < s.length(); i++) {
            String curElem = s.substring(i, i + 1);
            String lastElem = s.substring(s.length() - 1);
            if (curElem.equals(lastElem)) {

            }
        }
        return false;
    }
}