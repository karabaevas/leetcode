package blind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for(int i = 0; i < nums.length-2; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }

            int left = i+1;
            int right = nums.length-1;

            while(left < right){
                if(nums[i] + nums[left] + nums[right] < 0){
                    left++;
                }else if(nums[i] + nums[left] + nums[right] > 0){
                    right--;
                } else {
                    res.add(List.of(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    while(left < right && nums[left-1] == nums[left]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right+1]){
                        right--;
                    }
                }
            }
        }

        return res;
    }

}
