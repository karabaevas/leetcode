package blind75;

import java.util.*;

public class Ex49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            char[] ar =  str.toCharArray();
            Arrays.sort(ar);
            List<String> words = map.getOrDefault(new String(ar), new ArrayList<>());
            words.add(str);
            map.put(new String(ar), words);
        }

        return new ArrayList<>(map.values());
    }

}
