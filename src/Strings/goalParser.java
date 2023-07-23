package Strings;

public class goalParser {
    public static void main(String[] args) {
        String command = "G()()()()(al)";
        System.out.println(interpret(command));
    }
    public static String interpret(String command) {
        String step1 = command.replace("()", "o");
        String step2 = step1.replace("(al)", "al");
        return step2;
    }
}

/* Additional solution (space optimized)
class Solution {
    public String interpret(String command) {
        StringBuilder s= new StringBuilder();

        for(int i=0;i<command.length();i++){
            char c= command.charAt(i);
            if(c=='G') s.append(c);
            else if(c=='(' && command.charAt(i+1)==')'){
                s.append('o');
                i+=1;
            }
            else {
                s.append('a').append('l');
                i+=3;
            }
        }
        return s.toString();
    }
}
 */
