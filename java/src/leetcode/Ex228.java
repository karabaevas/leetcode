package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Ex228 {
    public static void main(String[] args) {
        Ex228 main = new Ex228();
    }

    public List<String> summaryRanges(int[] nums) {
        int i = 0;

        if(nums.length == 0){
            return new ArrayList<>();
        }
        if(nums.length == 1){
            return List.of(String.valueOf(nums[0]));
        }

        List<String> res = new ArrayList<>();
        while(i < nums.length){
            int startIdx = i;
            while(i+1 < nums.length && nums[i]+1 == nums[i+1]){
                i++;
            }

            if(startIdx != i){
                res.add(nums[startIdx] + "->" + nums[i]);
            } else {
                res.add(""+nums[startIdx]);
            }

            i++;
        }

        return res;
    }
}
