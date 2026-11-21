package iter1.uber.blind;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum/
public class Ex1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> visited = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            Integer idx = visited.get(target-nums[i]);

            if(idx!=null){
                return new int[]{i, idx};
            }
            visited.put(nums[i], i);
        }

        return new int[]{0,0};
    }
}
