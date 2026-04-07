package leetcode;

import java.util.HashMap;

public class Ex205 {
    public static void main(String[] args) {
        Ex205 main = new Ex205();



    }

    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> stMap = new HashMap();
        HashMap<Character, Character> tsMap = new HashMap();

        for(int i = 0; i< s.length(); i++){
            char schar = s.charAt(i);
            char tchar = t.charAt(i);

            Character tCharFromMap = stMap.get(schar);
            Character sCharFromMap = tsMap.get(tchar);

            if(tCharFromMap == null && sCharFromMap == null){
                stMap.put(schar, tchar);
                tsMap.put(tchar, schar);
                continue;
            }

            if(tCharFromMap == null && sCharFromMap != null
                    || tCharFromMap != null && sCharFromMap == null){
                return false;
            }

            if(tCharFromMap != tchar || sCharFromMap != schar){
                return false;
            }
        }

        return true;
    }


}
