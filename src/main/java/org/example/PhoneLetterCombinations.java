package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneLetterCombinations {
    public List<String> letterCombinations(String digits) {

        HashMap<String, String> letter = new HashMap<>();
        letter.put("2", "abc");
        letter.put("3", "def");
        letter.put("4", "ghi");
        letter.put("5", "jkl");
        letter.put("6", "mno");
        letter.put("7", "pqrs");
        letter.put("8", "tuv");
        letter.put("9", "wxyz");

        List<String> store = new ArrayList<>();
        List<String> result = new ArrayList<>();

        if (digits.length() < 1) {
            return result;
        } else if (digits.length() == 1) {
            String one = letter.get(digits);
            for (char c : one.toCharArray()) {
                result.add(String.valueOf(c));
            }
            return result;

        } else {

            for (int i = 0; i < digits.length(); i++) {
                for (String j : letter.keySet()) {
                    if (String.valueOf(digits.charAt(i)).equals(j)) {
                        store.add(letter.get(j));
                    }
                }
            }
        }

        if (store.size() > 1) {
            for (int i = 0; i < store.get(0).length(); i++) {
                for (int j = 0; j < store.get(1).length(); j++) {
                    String sub = String.valueOf(store.get(0).charAt(i)) + store.get(1).charAt(j);
                    result.add(sub);
                }
            }
        } else {
            for (int i = 0; i < store.get(0).length(); i++) {
                String word = String.valueOf(store.get(0).charAt(i));
                result.add(word);
            }
        }
        return result;

    }
}
