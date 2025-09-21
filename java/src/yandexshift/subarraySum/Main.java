package yandexshift.subarraySum;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public int subarraySum(int[] nums, int k) {
        int result = 0;
        Map<Integer, Integer> storage = new HashMap<>();
        int[] ps = new int[nums.length];

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            ps[i] = sum;

            if (ps[i] == k){
                ++result;
            }

            Integer counter = storage.getOrDefault(ps[i] - k, 0);
            if (counter != 0) {
                result = result + counter;
            }
            storage.put(ps[i], storage.getOrDefault(ps[i], 0) + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Main main = new Main();
//        System.out.println(main.subarraySum(new int[]{2,1,3,4}, 4));
//        System.out.println(main.subarraySum(new int[]{-1,-1,1}, 0));
//        System.out.println(main.subarraySum(new int[]{1, -1, 0}, 0));
//        System.out.println(main.subarraySum(new int[]{1, -1, 1, 1, 1, 1}, 3)); //4
        System.out.println(main.subarraySum(new int[]{1}, 0)); //4
//        System.out.println(main.subarraySum(new int[]{-1, 4}, 3)); //1
    }


}