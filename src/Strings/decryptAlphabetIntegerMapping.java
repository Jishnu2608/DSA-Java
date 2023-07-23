package Strings;

public class decryptAlphabetIntegerMapping {
    public static void main(String[] args) {
        String s = "10#11#12";
        System.out.println(freqAlphabets(s));
    }

    public static String freqAlphabets(String s) {

        /*It iterates through all possible double-digit numbers from 10 to 26 (inclusive). For each number i, it searches for occurrences of i# in the input string s and replaces them with the alphabetic character represented by (char)('a' + (i + 1)).The expression (char)('a' + (i + 1)) calculates the corresponding character based on the ASCII code of 'a' plus the value of i + 1. For example, when i is 10, it replaces "10#" with 'k', and when i is 11, it replaces "11#" with 'l'*/
        for(int i=10;i<=26;i++)
            s=s.replaceAll(i+ "#", (char)('a'+(i-1)) + "");


        /*It iterates through all possible single-digit numbers from 1 to 9 (inclusive). For each number i, it searches for occurrences of i in the input string s and replaces them with the alphabetic character represented by (char)('a' + (i - 1)). The expression (char)('a' + (i - 1)) calculates the corresponding character based on the ASCII code of 'a' plus the value of i - 1. For example, when i is 1, it replaces "1" with 'a', when i is 2, it replaces "2" with 'b',*/
        for(int i=1;i<=9;i++)
            s=s.replaceAll(i+"", (char)('a'+(i-1))+"");


        return s;
    }
}
