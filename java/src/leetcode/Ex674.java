package leetcode;

public class Ex674 {

    public int findLengthOfLCIS(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        int inc=1;
        int dec=1;
        int res = 1;
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i] > nums[i+1]){
                dec++;
                inc = 1;
                res = Math.max(res, dec);
                continue;
            }
            if(nums[i] < nums[i+1]){
                inc++;
                dec = 1;
                res = Math.max(res, inc);


            }
        }

        return res;
    }
}
