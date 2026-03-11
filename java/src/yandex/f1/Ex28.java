package yandex.f1;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class Ex28 {
    public static void main(String[] args) {
        Ex28 main = new Ex28();

        System.out.println(main.maxSlidingWindow(new int[]{1, 2, 3}, 2));
        main.maxSlidingWindow(new int[]{1, 2, 3}, 2);


    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        TreeSet<Dto> pq = new TreeSet<>(Comparator.comparingInt(Dto::value).thenComparing(Dto::indx).reversed());

        for (int i = 0; i < k; i++) {
            pq.add(new Dto(nums[i], i));
        }
        res[0] = pq.first().value;

        for (int i = 1; i < res.length; i++) {
            pq.remove(new Dto(nums[i - 1], i - 1));
            pq.add(new Dto(nums[i + k - 1], i + k - 1));
            res[i] = pq.first().value;
        }

        return res;
    }

    record Dto(int value, int indx){}

}
