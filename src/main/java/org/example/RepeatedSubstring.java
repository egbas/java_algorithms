package org.example;

import java.util.ArrayList;

public class RepeatedSubstring {
    public boolean repeatedSubstringPattern(String s) {
        int count = 0;
        s = s.toLowerCase();
        String word = "";
        String subString = "";
        ArrayList<Integer> numSet = new ArrayList<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(0)){
                count++;
            }
        }
        if(count == s.length()){
            return true;
        }

        // Early exit for short strings that cannot form patterns
        if (s.length() == 2 && s.charAt(0) != s.charAt(1) ) {
            return false;
        }
        if (s.length() == 2 && s.charAt(0) == s.charAt(1) || s.length() == 1) {
            return true;
        }

        // Collect all possible divisors
        for (int i = 2; i <= s.length() / 2; i++) {
            if (s.length() % i == 0) {
                numSet.add(i);
            }
        }

        // Check each divisor length
        for (int len : numSet) {
            subString = s.substring(0, len);
            word = "";

            // Construct the string by repeating the substring
            for (int j = 0; j < s.length() / len; j++) {
                word += subString;
            }

            // Check if constructed string matches the original string
            if (word.equals(s)) {
                return true;
            }
        }

        return false;
    }
}
