package yandex.last6month;

import java.util.*;

public class Ex25 {
    public static void main(String[] args) {
        Ex25 main = new Ex25();
    }


    public boolean isOneEditDistance(String s, String t) {
        int edits = 0;

        int sIdx = 0;
        int tIdx = 0;

        if(Math.abs(s.length()-t.length())>1){
            return false;
        }

        while (sIdx < s.length() && tIdx < t.length()) {
            if (s.charAt(sIdx) == t.charAt(tIdx)) {
                sIdx++;
                tIdx++;
            } else {
                edits++;
                if(edits >1){
                    return false;
                }

                if (s.length() > t.length()) {
                    sIdx++;
                } else if (t.length()> s.length()) {
                    tIdx++;
                } else {
                    tIdx++;
                    sIdx++;
                }
            }
        }

        if(sIdx <s.length() || tIdx < t.length()){
            edits++;
        }


        return  edits == 1;
    }
}
