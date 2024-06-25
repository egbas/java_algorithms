package org.example;

public class Main {
    public static void main(String[] args) {
        String word1 = "joy";
        String word2 = "Chris";
        MergeAlternatively mergeAlternatively = new MergeAlternatively();
        String word = mergeAlternatively.mergeAlternately(word1, word2);

        System.out.println(word);
    }
}