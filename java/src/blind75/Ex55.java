package blind75;

public class Ex55 {
    public boolean canJump(int[] nums) {
        Boolean[] dp = new Boolean[nums.length];

        return check(nums, 0, dp);
    }

    boolean check(int[] nums, int curIdx, Boolean[] dp){
        if(curIdx == nums.length-1){
            return true;
        }

        int curVal = nums[curIdx];
        if(curVal == 0){
            return false;
        }

        for(int i = 1; i<= curVal && curIdx + i < nums.length; i++){
            boolean res = dp[curIdx+i] == null ?  check(nums, curIdx+i, dp) : false;

            if(res){
                return res;
            } else {
                dp[curIdx] = false;
            }
        }

        return false;
    }
}
