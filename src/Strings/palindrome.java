//https://leetcode.com/problems/valid-palindrome/
package Strings;

public class palindrome {
    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {

        String tempString = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        StringBuilder str = new StringBuilder(tempString);

        String rev = str.reverse().toString();

        return tempString.equals(rev);
    }
}

/*Optimized solution

class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left)))
                left++;
            else if (!Character.isLetterOrDigit(s.charAt(right)))
                right--;
            else if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
                return false;
            else {
                left++;
                right--;
            }
        }
        return true;
    }
}
 */
