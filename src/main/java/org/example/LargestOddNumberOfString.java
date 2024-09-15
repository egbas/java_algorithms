package org.example;

public class LargestOddNumberOfString {

    public int largestOddNumOfString( String values){
        int max = 0;
        for (int i = 0; i < values.length(); i++){
            int num = Integer.valueOf(String.valueOf(values.charAt(i)));
            if (num % 2 != 0){
                if (num > max){
                    max = num;
                }
            }
        }
        return max;
    }
}
