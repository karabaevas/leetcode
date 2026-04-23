package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Ex228_1 {
    public List<String> summaryRanges(int[] nums) {
        int i = 0;
        List<String> res = new ArrayList<>();

        while(i < nums.length){
            int start = nums[i];

            while( i < nums.length-1 && nums[i]+1 == nums[i+1]){
                i++;
            }

            if(nums[i] == start){
                res.add("" + start);
            } else {
                res.add("" + start + "->" + nums[i]);
            }

            i++;
        }

        return res;
    }
}
