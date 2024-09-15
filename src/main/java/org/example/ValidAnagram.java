package org.example;

import java.util.Arrays;

public class ValidAnagram {

    public boolean validAnagram(String value1, String value2){
        char[] str1 = value1.toCharArray(); // conversion of strings to char array because strings cannot be sorted as it is immutable
        char[] str2 = value2.toCharArray();
        Arrays.sort(str1); //Array function to sort
        Arrays.sort(str2);

        if (Arrays.equals(str1, str2)){ // Arrays has a function to confirm equality just as strings
            return true;
        } else {
            return false;
        }
    }
}
