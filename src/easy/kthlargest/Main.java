package easy.kthlargest;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] ints = {};
        KthLargest kthLargest = new KthLargest(1, ints);
        System.out.println(kthLargest.add(-3));
        System.out.println(kthLargest.add(-2));
        System.out.println(kthLargest.add(-4));
        System.out.println(kthLargest.add(0));
        System.out.println(kthLargest.add(4));

        System.out.println();
    }
}

class KthLargest {
    int k = 0;
    List<Integer> values;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        if (nums.length == 0){
            values = new ArrayList<>();
        }else {
            values = new ArrayList<>(Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).toList());
        }
    }

    public int add(int val) {
        values.add(val);
        Collections.sort(values, Comparator.reverseOrder());
        if (values.size() == 0){
            return val;
        }
        if (values.size()-1 < k){
            return values.get(values.size()-1);
        }

        return values.get(k-1);
    }
}