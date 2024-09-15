package org.example;

public class RemoveCharFromString {

    public String removeChar(String word, String checker){
        String temp = "";

        for (int i = 0; i < word.length(); i++){

            if (!checker.contains(String.valueOf( word.charAt(i)))){
                temp += word.charAt(i);
            }

        }

        return temp;
    }
}
