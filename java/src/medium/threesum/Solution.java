package medium.threesum;

import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int k = nums.length - 1;
            int j = i + 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) result.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                if (sum < 0) j++;
                if (sum > 0) k--;
            }
        }


        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        int[] ints = {-1, 0, 1, 2, -1, -4};
        System.out.println(new Solution().threeSum(ints));
    }
}