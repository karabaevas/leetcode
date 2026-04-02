package leetcode;

import java.util.TreeMap;

public class Ex1438 {
    public static void main(String[] args) {
        Ex1438 main = new Ex1438();
        main.longestSubarray(new int[]{8,2,4,7}, 4);
    }

    public int longestSubarray(int[] nums, int limit) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        int left = 0;
        int right = 0;
        int res = 0;

        while(right < nums.length){
            Integer counter = map.getOrDefault(nums[right], 0);
            map.put(nums[right], counter+1);

            while(map.lastEntry().getKey() - map.firstEntry().getKey() > limit){
                Integer leftCounter = map.get(nums[left]);
                if(leftCounter == 1){
                    map.remove(nums[left]);
                } else {
                    leftCounter--;
                    map.put(nums[left], leftCounter);
                }
                left++;
            }

            res = Math.max(right-left+1, res);
            right++;
        }

        return res;
    }
}
