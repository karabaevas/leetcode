package yandex.f1;

import java.util.*;

import static java.util.Map.Entry.comparingByValue;

public class Ex5 {
    public static void main(String[] args) {
        Ex5 main = new Ex5();

        System.out.println(main.topKFrequent(new int[]{1, 1, 3, 3, 3, 4, 4, 5, 2, 5, 2, 2, 2, 2,}, 3));
        System.out.println(main.topKFrequent(new int[]{1,1,1,2,2,3}, 2));
        System.out.println(main.topKFrequent(new int[]{1,1,1,2,2,3}, 1));
        System.out.println(main.topKFrequent(new int[]{1,1,1,2,2,3}, 3));

    }


//    пробежаться по массиву и составить мапу элемент - количество вхождений
// но как получить те у которых

    public int[] topKFrequent(int[] nums, int k) {
        if (k == 0 || nums == null || nums.length == 0) {
            return new int[]{};
        }

        Map<Integer, Integer> storage = new HashMap<>();
        for (int num : nums) {
            int freq = storage.getOrDefault(num, 0) + 1;
            storage.put(num, freq);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(Comparator.comparing(Map.Entry<Integer, Integer>::getValue));
        for (Map.Entry<Integer, Integer> entry : storage.entrySet()) {
            pq.offer(entry);
            if (pq.size() > k) {
                pq.poll();
            }
        }


        int[] result = new int[k];
        int size = pq.size();
        for (int i = 0; i < size; i++) {
            result[i] = pq.poll().getKey();
        }

        return result;
    }


}
