package easy.top.k.frequent.elements;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(new Main().getKMax(new String("AABBCBBCDDFDDDEEFFHFFFF"), 4));
    }

    public String getKMax(String word, int k) {
        Map<String, Integer> map = new HashMap<>();
        Set<String> keys = map.keySet();

        for (String s : word.split("")) {
            Integer value = map.get(s);
            if (value == null){
                map.put(s, 0);
            } else {
                map.put(s, ++value);
            }
        }

        return "";
    }
}
