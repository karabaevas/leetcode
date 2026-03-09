package yandex.f1;

import java.util.*;

public class Ex18 {
    public static void main(String[] args) {
        Ex18 main = new Ex18();

//        main.threeSum(new int[]{10, -10,9, 0, 1, -1,2,-2,-2-3,-4});
        main.fourSum(new int[]{1000000000,1000000000,1000000000,1000000000}, -294967296);
//        main.fourSum(new int[]{1,-2,-5,-4,-3,3,3,5}, -11);

    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int left = j+1;
                int right = nums.length - 1;

                while (left < right) {
                    long sum = (long)nums[i] + (long)nums[j] + (long)nums[left] + (long)nums[right];
                    if (sum == target) {
                        result.add(List.of(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;
                        continue;
                    }

                    if (sum < target) {
                        left++;
                    }
                    if (sum > target) {
                        right--;
                    }
                }
            }
        }

        return new ArrayList<>(result);
    }

}
