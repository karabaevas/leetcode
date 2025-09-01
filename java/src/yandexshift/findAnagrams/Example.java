package yandexshift.findAnagrams;

import java.util.*;

public class Example {
    public static void main(String[] args) {
        Example main = new Example();
        System.out.println(main.findAnagrams("aaaaaaaaaa", "aaaaaaaaaaaaa"));
    }

    public List<Integer> findAnagrams(String s, String p) {
        if (s.length() < p.length()) {
            return Collections.emptyList();
        }

        Map<Character, Integer> smap = new HashMap<>();
        Map<Character, Integer> pmap = new HashMap<>();

        for (int i = 0; i < p.length(); i++) {
            Integer counter = smap.getOrDefault(s.charAt(i), 0);
            smap.put(s.charAt(i), ++counter);

            Integer pcounter = pmap.getOrDefault(p.charAt(i), 0);
            pmap.put(p.charAt(i), ++pcounter);
        }

        int left = 0;
        List<Integer> res = new ArrayList<>();
        while (left + p.length() - 1 < s.length()) {
            if (left == 0) {
                if (smap.equals(pmap)) {
                    res.add(0);
                }
            } else {
                char prevLetter = s.charAt(left - 1);
                Integer counter = smap.get(prevLetter);
                if (counter == 1) {
                    smap.remove(prevLetter);
                } else {
                    smap.put(prevLetter, --counter);
                }

                char currentLetter = s.charAt(left + p.length() - 1);
                Integer currentLetterCounter = smap.getOrDefault(currentLetter, 0);
                smap.put(currentLetter, ++currentLetterCounter);
                if (pmap.containsKey(currentLetter)) {
                    if (smap.equals(pmap)) {
                        res.add(left);
                    }
                }
            }

            left++;
        }


        return res;
    }

}
