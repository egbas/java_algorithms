package org.example;

public class MergeAlternatively {
    public String mergeAlternately(String word1, String word2) {
        String mainWord = "";
        int length = 0;
        if(word1.length() > word2.length()){
            length = word1.length();
        } else {
            length = word2.length();
        }

        for(int i = 0; i < length; i++){
            if(i < word1.length()){
                mainWord += word1.charAt(i);
            }
            if(i < word2.length()){
                mainWord += word2.charAt(i);
            }
        }
        return mainWord;
    }
}
