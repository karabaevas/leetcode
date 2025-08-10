package easy.maxProduct;

public class Solution {
    public int maxProduct(int[] nums) {
        int l = 1;
        int r = 1;
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            l = l == 0? 1:l;
            r = r == 0? 1:r;

            l *= nums[i];
            r *= nums[nums.length - 1 - i];

            max = Math.max(Math.max(l, r), max);
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().maxProduct(new int[]{2, -5, -2, -4, 3}));
//        System.out.println(new Solution().maxProduct(new int[]{1, -2, 0, -3, 4, -2}));
    }
}
