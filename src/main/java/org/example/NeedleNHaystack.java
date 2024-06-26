package org.example;

public class NeedleNHaystack {
    public int strStr(String haystack, String needle) {

        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }

        return -1;

    }
}
