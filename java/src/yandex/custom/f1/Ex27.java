package yandex.custom.f1;

import java.util.Comparator;
import java.util.TreeSet;

public class Ex27 {
    public static void main(String[] args) {
        Ex27 main = new Ex27();


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