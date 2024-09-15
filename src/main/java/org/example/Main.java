package org.example;

public class Main {
    public static void main(String[] args) {

        RemoveCharFromString rem = new RemoveCharFromString();

        String word = "How are you doing bro";
        String checker = "bao";
        System.out.println(rem.removeChar(word, checker));
    }
}