package medium.permutations;


import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        doDirt(nums, 0, result);

        return result;
    }

    private void doDirt(int[] nums, int level, List<List<Integer>> result) {
        if (level == nums.length) {
            result.add(convertToList(nums));
        } else {
            int temp;
            for (int i = level; i < nums.length; i++) {
                int[] copy = Arrays.copyOf(nums, nums.length);
                temp = copy[level];
                copy[level]=copy[i];
                copy[i] = temp;
                doDirt(copy, level+1, result);
            }
        }
    }

    private List<Integer> convertToList(int[] nums) {
        List<Integer> ar = new ArrayList<>();
        for (int i1 = 0; i1 < nums.length; i1++) {
            ar.add(nums[i1]);
        }
        return ar;
    }

    public static void main(String[] args) {
        int[] ints = {1, 2, 3};
//        int[] ints1 = {1, 2};
//        System.out.println(ints == ints1);
        List<List<Integer>> permute = new Solution().permute(ints);
        System.out.println(permute);
    }
}