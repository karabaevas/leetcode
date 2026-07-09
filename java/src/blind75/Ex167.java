package blind75;

import java.util.HashMap;
import java.util.Map;

public class Ex167 {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int r=numbers.length-1;

        while(l<r){
            int sum = numbers[l] + numbers[r];
            if(sum == target){
                return new int[]{l+1, r+1};
            }

            if(sum<target){
                l++;
            } else{
                r--;
            }
        }
        return null;
    }
}
