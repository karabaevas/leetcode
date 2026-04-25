package leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex2841 {
    public static void main(String[] args) {
        Ex2841 main = new Ex2841();



    }

    public long maxSum(List<Integer> nums, int m, int k) {
        long res = 0l;
        long sum = 0l;

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< k; i++){
            int counter = map.getOrDefault(nums.get(i), 0);
            map.put(nums.get(i), ++counter);
            sum +=nums.get(i);
        }
        if(map.size() >= m){
            res = Math.max(sum, res);
        }

        int left =1;
        int right = k;
        while(right < nums.size()){
            sum -= nums.get(left-1);
            sum += nums.get(right);

            Integer counterPrev = map.get(nums.get(left-1));
            if(counterPrev==1){
                map.remove(nums.get(left-1));
            }else {
                map.put(nums.get(left-1), --counterPrev);
            }

            int counterNext = map.getOrDefault(nums.get(right), 0);
            map.put(nums.get(right), ++counterNext);

            if(map.size() >= m){
                res = Math.max(sum, res);
            }

            left++;
            right++;
        }
        return res;
    }

}
