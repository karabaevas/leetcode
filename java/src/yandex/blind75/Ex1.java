package yandex.blind75;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {
    public static void main(String[] args) {
        Ex1 main = new Ex1();



    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> storage = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            Integer idx = storage.get(target-nums[i]);
            if(idx != null){
                return new int[]{i, idx};
            }

            storage.put(nums[i], i);
        }

        return new int[]{};
    }


}
