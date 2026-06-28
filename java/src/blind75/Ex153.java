package blind75;

import java.util.HashMap;
import java.util.Map;

public class Ex153 {
    public int findMin(int[] nums) {
        int l=0;
        int r = nums.length-1;

        while(r-l>1){
            int m = (r+l)/2;
            if(nums[l] > nums[m]){
                r = m;
            } else if(nums[r] < nums[m]){
                l = m;
            } else {
                return nums[l];
            }
        }

        return nums[l]<nums[r]? nums[l]:nums[r];
    }
}
