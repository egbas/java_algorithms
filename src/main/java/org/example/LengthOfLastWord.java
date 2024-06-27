package org.example;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {

        String[] word = s.split(" ");
        int length = 0;

        for(int i = 0; i < word.length; i++){
            if(i == word.length -1){
                length = word[i].length();
            }
        }
        return length;

    }
}
