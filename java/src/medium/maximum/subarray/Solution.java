package medium.maximum.subarray;

class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int[] sums = new int[nums.length];

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int local = nums[i] + sum;
            if (nums[i] < 0 && local < 0){
                    sum = 0;
                    sums[i] = local;
            } else {
                sum = local;
                sums[i] = sum;
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < sums.length; i++) {
            if (sums[i] >= max){
                max = sums[i];
            }
        }


        return max;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().maxSubArray(new int[]{-2,-1,-3,-5,-1,-2,-1,-5,-4}));
    }
}