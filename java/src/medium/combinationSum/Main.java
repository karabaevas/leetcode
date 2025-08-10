package medium.combinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.combinationSum(new int[]{2, 3, 5, 7}, 7));
//        System.out.println(main.combinationSum(new int[]{3, 5}, 8));
//        System.out.println(main.combinationSum(new int[]{2, 3}, 8));
    }


    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, target, 0);
        return list;
    }

  private void backtrack(List<List<Integer>> result, List<Integer> temp, int nums[], int remain, int start){
        if (remain < 0)
            return;
        if (remain == 0){
            result.add(new ArrayList<>(temp));
            return;
        }
        if (remain > 0) {
            for (int i = start; i < nums.length; i++) {
                temp.add(nums[i]);
                backtrack(result, temp, nums,remain-nums[i], i);
                temp.remove(temp.size() -1);
            }
      }
  }

}
