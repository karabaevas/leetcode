package yandexshift.isIsomorphic;

import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        Example main = new Example();
        System.out.println();
    }

//    foo -> bar
//    egg -> add
//    badc -> baba
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> stMapping = new HashMap<>();
        Map<Character, Character> tsMapping = new HashMap<>();

        for (int i = 0; i< s.length(); i++){
            Character sLetter = s.charAt(i);
            Character tLetter = t.charAt(i);

            Character prevTLetter = stMapping.get(sLetter);
            Character prevSLetter = tsMapping.get(tLetter);

            if (prevTLetter == null && prevSLetter == null){
                stMapping.put(sLetter, tLetter);
                tsMapping.put(tLetter, sLetter);
            } else {
                if (prevTLetter != tLetter || prevSLetter != sLetter){
                    return false;
                }
            }
        }
        return true;
    }
}
