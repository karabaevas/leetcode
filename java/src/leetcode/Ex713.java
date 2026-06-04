package leetcode;

public class Ex713 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int res = 0;
        int multRes = 1;

        int start = 0;
        for(int i = 0; i<nums.length; i++){
            multRes *= nums[i];

            while(multRes >= k && i != start){
                multRes = multRes / nums[start];
                start++;
            }

            if(multRes <k){
                res += i - start + 1;
            }
        }

        return res;
    }
}
