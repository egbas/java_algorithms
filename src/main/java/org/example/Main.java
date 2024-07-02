package org.example;

public class Main {
    public static void main(String[] args) {
        String word1 = "egbas";
        String word2 = "s";
        RetrieveStringAtIndex retrieveStringAtIndex = new RetrieveStringAtIndex();
        int index = retrieveStringAtIndex.stringAtIndex(word1, word2);

        System.out.println(index);
    }
}