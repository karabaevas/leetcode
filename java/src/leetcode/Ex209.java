package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Ex209 {
    public static void main(String[] args) {
        Ex209 main = new Ex209();



    }

    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;

        int sum = 0;
        int res = Integer.MAX_VALUE;
        while(right < nums.length){
            sum += nums[right];

            while(sum >= target){
                res = Math.min(res, right-left+1);

                sum -= nums[left];
                left++;
            }

            right++;
        }

        return res == Integer.MAX_VALUE ? 0 : res;
    }

}
