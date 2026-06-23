package blind75;

public class Ex268 {
    public int missingNumber(int[] nums) {
        int res = 0;
        for(int i = 0; i <= nums.length; i++){
            res = res ^ i;
        }

        for(int num: nums){
            res = res ^ num;
        }

        return res;
    }
}
