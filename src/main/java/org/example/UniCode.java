package org.example;

public class UniCode {

    public int getUnicode(String str, int index){
        int num = 0;

        num = str.codePointAt(index);
        return num;
    }

    public int unicodeBeforeIndex(String str, int index){
        int num = str.codePointAt(index -1);
        return num;
    }
}
