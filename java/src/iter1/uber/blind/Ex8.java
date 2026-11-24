package iter1.uber.blind;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex8 {
//    https://leetcode.com/problems/squares-of-a-sorted-array/
    public int[] sortedSquares(int[] nums) {
        int l = 0;
        int r = nums.length-1;

        int[] res = new int[nums.length];

        for(int i = nums.length-1; i >=0; i--){
            if(nums[l]*nums[l] > nums[r]*nums[r]){
                res[i]=nums[l]*nums[l];
                l++;
            }else {
                res[i]=nums[r]*nums[r];
                r--;
            }
        }

        return res;
    }

}
