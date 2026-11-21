package iter0.blind75;

public class Ex238 {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];

        int tmp = 1;
        for(int i = 0; i<nums.length; i++){
            res[i] = tmp;
            tmp = tmp*nums[i];
        }

        tmp = 1;
        for(int i = nums.length-1; i>=0; i--){
            res[i] = res[i]*tmp;
            tmp = tmp*nums[i];
        }

        return res;
    }
}
