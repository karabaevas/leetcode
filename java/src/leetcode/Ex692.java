package leetcode;

import java.util.*;

public class Ex692 {
    record Dto(int counter, String word) {
    }

    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        TreeSet<Dto> tree = new TreeSet<>(Comparator.comparingInt(Dto::counter).reversed().thenComparing(Dto::word));
        for (String word : map.keySet()) {
            int counter = map.get(word);
            tree.add(new Dto(counter, word));
            while (tree.size() > k) {
                tree.removeLast();
            }
        }


        return tree.stream().map(Dto::word).toList();
    }
}
