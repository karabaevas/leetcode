package medium.threesum;

import java.util.*;

class SlowSolution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> triplets = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if (i != j && j != k && i != k && (nums[i] + nums[j] + nums[k] == 0)) {
                        List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(list);
                        triplets.add(list);
                    }
                }
            }
        }

        return triplets.stream().toList();
    }

    public static void main(String[] args) {
        int[] ints = {-1, 0, 1, 2, -1, -4};
        System.out.println(new SlowSolution().threeSum(ints));
    }
}