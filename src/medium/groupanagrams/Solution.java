package medium.groupanagrams;

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] ar = strs[i].toCharArray();
            Arrays.sort(ar);
            String key = new String(ar);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(strs[i]);
            map.put(key, list);
        }

        return new ArrayList<>(map.values());
    };

    public static void main(String[] args) {
        String[] strs = {"a"};
        List<List<String>> lists = new Solution().groupAnagrams(strs);

        System.out.println(lists);
    }
}