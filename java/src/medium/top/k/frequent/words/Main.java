package medium.top.k.frequent.words;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println();
//        main.topKFrequent();
    }

    public List<String> topKFrequent(String[] words, int k) {
        if (words.length == 0) {
            return new ArrayList<>();
        }
        if (words.length == 1) {
            ArrayList<String> arrays = new ArrayList<>();
            arrays.add(words[0]);
            return arrays;
        }

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            Integer counter = map.getOrDefault(word, 0);
            map.put(word, ++counter);
        }
//        A -1, B - 3, C- 2, D- 2
        TreeMap<Integer, List<String>> map1 = new TreeMap<>(Comparator.reverseOrder());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String word = entry.getKey();
            Integer counter = entry.getValue();

            List<String> listOfWords = map1.getOrDefault(counter, new ArrayList<>());
            listOfWords.add(word);
            map1.put(counter, listOfWords);
        }
//        3 - [B], 2 - [C, D],  1 - [A]
        List<String> result = new ArrayList<>();
        while (map1.firstEntry() != null) {
            Map.Entry<Integer, List<String>> entry = map1.pollFirstEntry();
            List<String> values = entry.getValue();
            Collections.sort(values);
            for (String word : values) {
                if (result.size() != k) {
                    result.add(word);
                } else {
                    return result;
                }
            }
        }

        return result;
    }
}
