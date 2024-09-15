package org.example;

public class ReverseWordsInString {

    public String reverseWords(String sentence){
        String[] strings = sentence.split(" ");
        String words = "";

        for (int i = strings.length - 1; i >= 0; i--){
            if (i == 0){
                words = words + strings[i];
            } else {
                words = words + strings[i] + " ";
            }
        }
        return words;
    }
}
