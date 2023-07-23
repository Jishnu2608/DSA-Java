//https://leetcode.com/problems/determine-if-string-halves-are-alike/
package Strings;

public class alikeHalves {
    public static void main(String[] args) {
        String s = "textbook";
        System.out.println(halvesAreAlike(s));
    }
    public static boolean halvesAreAlike(String s) {

        String first = s.substring(0, s.length()/2);
        String second = s.substring(s.length()/2, s.length());

        int vowelsCount1 = countVowels(first);
        int vowelsCount2 = countVowels(second);

        if(vowelsCount1 == vowelsCount2)
            return true;
        return false;
    }
    static int countVowels(String str) {
        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }
}
