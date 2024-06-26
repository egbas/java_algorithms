package org.example;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int count = 0;
        String subString = "";
        int min = strs[0].length();
        for(String item : strs){
            if(item.length() < min){
                min = item.length();
            }
        }
        String checker = strs[0];
        for(int i = 0; i < min; i++){
            for(int j = 0; j < strs.length; j++){
                if(checker.charAt(i) == strs[j].charAt(i)){
                    count++;
                }
            }
            if(count == strs.length){
                subString += checker.charAt(i);
                count = 0;
            } else {
                break;
            }
        }
        return subString;

    }
}
