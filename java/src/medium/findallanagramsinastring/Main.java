package medium.findallanagramsinastring;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> anagrams = new Main().findAnagrams("cbaebabacd", "abc");
        System.out.println(anagrams);
//        List<Integer> anagrams1 = new Main().findAnagrams("abab", "ab");
//        List<Integer> anagrams12 = new Main().findAnagrams("aa", "b");


    }

    public List<Integer> findAnagrams(String s, String p) {
        if (s.length() < p.length()){
            return Collections.emptyList();
        }
        List<Integer> result = new ArrayList<>();

        Map<Character, Integer> pMap = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            Integer value = pMap.getOrDefault(p.charAt(i), 0);
            pMap.put(p.charAt(i), ++value);
        }


        Map<Character, Integer> sMap = new HashMap<>();
        for (int j = 0; j < p.length(); j++){
            Integer value = sMap.getOrDefault(s.charAt(j), 0);
            sMap.put(s.charAt(j), ++value);
        }
        if (sMap.equals(pMap)){
            result.add(0);
        }

        for (int i = 1; i <= s.length() - p.length(); i++) {
            Integer value = sMap.getOrDefault(s.charAt(i-1), 0);
            if (value == 1){
                sMap.remove(s.charAt(i-1));
            }else{
                sMap.put(s.charAt(i-1), --value);
            }

            int index = i + p.length() -1;
            Integer value1 = sMap.getOrDefault(s.charAt(index), 0);
            sMap.put(s.charAt(index), ++value1);

            if (sMap.equals(pMap)){
                result.add(i);
            }
        }
        return result;
    }
}
