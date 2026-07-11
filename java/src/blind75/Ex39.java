package blind75;

import java.util.*;

public class Ex39 {

    static void main() {
        new Ex39().combinationSum(new int[] {3,4,5}, 16);
    }

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        m1(nums, target, 0, 0, new ArrayList(), res);
        return res;
    }


    void m1(int[] nums, int target, int idx, int sum, List<Integer> path, List<List<Integer>> res){

        for(int i = idx; i< nums.length; i++){
            int newsum = sum + nums[i];
            List<Integer> newpath = new ArrayList<>(path);
            newpath.add(nums[i]);

            if(newsum > target){
                continue;
            }
            if(newsum == target){
                res.add(newpath);
                return;
            }

            m1(nums, target, i, newsum, newpath, res);
        }
    }
}
