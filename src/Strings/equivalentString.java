//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
package Strings;

public class equivalentString {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"}, word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for (int i = 0; i < word1.length; i++) {
            s1.append(word1[i]);
        }

        for (int i = 0; i < word2.length; i++) {
            s2.append(word2[i]);
        }

        String a = s1.toString();
        String b = s2.toString();
        return a.equals(b);
    }
}
