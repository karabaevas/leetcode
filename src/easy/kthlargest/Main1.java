package easy.kthlargest;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
//        int[] ints = {};
//        KthLargest kthLargest = new KthLargest(1, ints);
//        System.out.println(kthLargest.add(-3));
//        System.out.println(kthLargest.add(-2));
//        System.out.println(kthLargest.add(-4));
//        System.out.println(kthLargest.add(0));
//        System.out.println(kthLargest.add(4));

        int[] ints = {4,7,7,7, 7, 8 ,3};
        KthLargest kthLargest = new KthLargest(4, ints);
        System.out.println(kthLargest.add(2));
        System.out.println(kthLargest.add(10));
        System.out.println(kthLargest.add(9));
        System.out.println(kthLargest.add(9));

        System.out.println();
    }
}

class KthLargest {
    int k = 0;
    int[] nums;
    PriorityQueue<Integer> pq;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.nums = nums;
        this.pq = new PriorityQueue<>(k);

        for (int i = 0; i < nums.length; i++) {
            add(nums[i]);
        }
    }

    public int add(int val) {
        if (pq.size() < k){
            pq.add(val);
        } else if(pq.size() == k) {
            if(pq.peek() < val){
                pq.poll();
                pq.add(val);
            }
        }

        return pq.peek();
    }
}