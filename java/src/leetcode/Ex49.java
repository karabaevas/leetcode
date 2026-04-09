package leetcode;

import java.util.*;

public class Ex49 {
    public static void main(String[] args) {
        Ex49 main = new Ex49();



    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(int i=0; i< strs.length; i++){
            char[] cur = strs[i].toCharArray();
            Arrays.sort(cur);
            String sortedCur = new String(cur);

            List<String> list = map.getOrDefault(sortedCur, new ArrayList<>());
            list.add(strs[i]);
            map.put(sortedCur, list);
        }

        return new ArrayList<>(map.values());
    }

}
