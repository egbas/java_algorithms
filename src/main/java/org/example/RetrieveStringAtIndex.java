package org.example;

public class RetrieveStringAtIndex {

    public int stringAtIndex(String word, String letter){
        int index = 0;
        for (int i = 0; i < word.length(); i++){
            if (String.valueOf(word.charAt(i)).equals(letter)){
                return i;
            }
        }
        return -1;
    }
}
