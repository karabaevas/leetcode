package easy.single.number;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result = num ^ result;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().singleNumber(new int[]{2,2,1}));
        System.out.println(new Solution().singleNumber(new int[]{4,1,2,1,2}));
        System.out.println(new Solution().singleNumber(new int[]{1}));
//        System.out.println(new Solution().singleNumber(new int[]{1,2,3,4,5}));
    }
}