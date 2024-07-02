package org.example;

public class Main {
    public static void main(String[] args) {
        String word1 = "egbas";
        int word2 = 4;
        UniCode retrieveStringAtIndex = new UniCode();
        int index = retrieveStringAtIndex.getUnicode(word1, word2);


        System.out.println(index);
    }
}