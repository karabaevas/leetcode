package easy.isisomorphic;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.isIsomorphic("egg", "add"));
        System.out.println(main.isIsomorphic("paper", "title"));
        System.out.println(main.isIsomorphic("bbbaaaba", "aaabbbba"));
        System.out.println(main.isIsomorphic("badc", "baba"));
    }

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> stmapping = new HashMap<>();
        Map<Character, Character> tsMapping = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            Character value = stmapping.get(sChar);
            Character revValue = tsMapping.get(tChar);
            if (value == null && revValue == null) {
                stmapping.put(sChar, tChar);
                tsMapping.put(tChar, sChar);
            } else {
                if (value == null || revValue == null || revValue != sChar || value != tChar) {
                    return false;
                }
            }
        }

        return true;
    }
}
