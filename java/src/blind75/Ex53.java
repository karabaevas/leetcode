package blind75;

public class Ex53 {
    public int maxSubArray(int[] nums) {
        int sum = 0, maxSum = Integer.MIN_VALUE;
        int left = 0, right = 0;

        while(right < nums.length) {
            while(right < nums.length && sum >= 0){
                sum += nums[right];
                maxSum = Math.max(sum, maxSum);
                right++;
            }

            left = right;
            sum = 0;
        }

        return maxSum;
    }
}
