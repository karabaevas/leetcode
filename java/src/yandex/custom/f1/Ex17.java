package yandex.custom.f1;

import java.util.*;

public class Ex17 {
    public static void main(String[] args) {
        Ex17 main = new Ex17();

//        main.threeSum(new int[]{10, -10,9, 0, 1, -1,2,-2,-2-3,-4});
        main.threeSum(new int[]{-1,0,1,2,-1,-4});

    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        if (nums.length < 3) {
            return Collections.emptyList();
        }


        Set<List<Integer>> results = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0){
                break;
            }
            int fixed = nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int cur = fixed + nums[left] + nums[right];
                if (cur == 0) {
                    results.add(List.of(fixed, nums[left], nums[right]));
                    left++;
                    right--;
                }
                if (cur>0){
                    right--;
                }
                if (cur<0){
                    left++;
                }
            }
        }

        return new ArrayList<>(results);
    }

}
