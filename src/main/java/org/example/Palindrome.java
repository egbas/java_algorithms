package org.example;

public class Palindrome {

    public boolean isPalindrome(String word){
        word = word.toLowerCase();
        String temp = "";

        for (int i = word.length() - 1; i >= 0; i--){
            temp += word.charAt(i);
        }
        if (word.equals(temp)){
            return true;
        }
        return false;
    }
}
