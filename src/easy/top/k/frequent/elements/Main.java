package easy.top.k.frequent.elements;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
//        System.out.println(new Main().topKFrequent(new int[]{1, 2, 3, 4, 45, 5, 6, 4, 3, 2, 1, 1, 2}, 4));
//        System.out.println(new Main().topKFrequent(new int[]{1,1,1,2,2,3}, 2));
        System.out.println(new Main().topKFrequent(new int[]{1,2}, 2));
    }

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer value = map.getOrDefault(nums[i], 0);
            value++;
            map.put(nums[i], value);
        }

        TreeMap<Integer, List<Integer>> tree = new TreeMap<>(Comparator.reverseOrder());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            List<Integer> list = tree.getOrDefault(entry.getValue(), new ArrayList<>());
            list.add(entry.getKey());
            tree.put(entry.getValue(), list);
        }

        List<Integer> result = new ArrayList<>();
        while (k > 0) {
            List<Integer> ints = tree.lastEntry().getValue();
            for (int i = 0; i < ints.size(); i++) {
                if (k>=0){
                    Integer val = ints.get(i);
                    result.add(val);
                    k--;
                } else {
                    return result.stream()
                            .mapToInt(Integer::intValue)
                            .toArray();
                }
            }
            tree.remove(tree.lastEntry().getKey());

        }

        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
