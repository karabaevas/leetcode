package yandexshift.findClosestElements;

import java.util.*;

public class Example {
    public static void main(String[] args) {
        Example main = new Example();
        System.out.println(main.findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, 3));
    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((Integer a, Integer b) -> {
            int res = 0;
            if (Objects.equals(a, b)) {
                res = 0;
            }

            if (Math.abs(a - x) < (Math.abs(b - x)) || (Math.abs(a - x) == (Math.abs(b - x)) && (a < b))) {
                res= -1;
            } else {
                res = 1;
            }

            return res;
        }
        );

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }

        List<Integer> res = new ArrayList<>();
        while (k > 0) {
            Integer poll = pq.poll();

            System.out.println(poll);
            res.add(poll);
            k--;
        }

        Collections.sort(res);

        return res;
    }
}
