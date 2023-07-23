package Strings;

public class sortingSentence {
    public static void main(String[] args) {
        String sentence = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(sentence));
    }
    public static String sortSentence(String s) {
        //sentence is stored in an array. Detect a space, split and store
        String[] splitted = s.split(" ");
        //array to store words in seq
        String[] helper = new String[splitted.length];
        StringBuilder ans = new StringBuilder();

        for(int i=0;i<splitted.length;i++){
            int lastDigit = splitted[i].charAt(splitted[i].length()-1)-'0';
            /*this is a character literal. Here, the character '0' is treated as an integer (ASCII value of '0' is 48).
            So, if the length of the string at index i is 5, then splitted[i].length() - 1 - '0'
            would evaluate to 5 - 1 - 48, which equals 4. */

            helper[lastDigit -1] = splitted[i].substring(0,splitted[i].length()-1);
        }

        for(int i=0;i<helper.length;i++){
            ans.append(helper[i]).append(" ");
        }

        //There remains spaces at the end. To remove, trim
        return ans.toString().trim();
    }

}
