package Strings;

import java.util.*;

public class matchingRule {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();

        // Creating the inner lists
        List<String> list1 = new ArrayList<>();
        list1.add("phone");
        list1.add("blue");
        list1.add("pixel");

        List<String> list2 = new ArrayList<>();
        list2.add("computer");
        list2.add("silver");
        list2.add("lenovo");

        List<String> list3 = new ArrayList<>();
        list3.add("phone");
        list3.add("gold");
        list3.add("iphone");

        // Adding the inner lists to the outer list
        items.add(list1);
        items.add(list2);
        items.add(list3);

        String ruleKey = "color";
        String ruleValue = "silver";

        System.out.println(countMatches(items, ruleKey,ruleValue));
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count =0;
        for(int i=0;i<items.size();i++){
            if(items.get(i).get(getRule(ruleKey)).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }

    static int getRule(String ruleKey){
        if(ruleKey.equals("type")){
            return 0;
        }
        else if(ruleKey.equals("color")){
            return 1;
        }
        return 2;
    }

}
