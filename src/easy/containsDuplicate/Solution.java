package easy.containsDuplicate;


class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 0 || nums.length ==1)
            return false;

        int some = nums[0];

        for (int i = 1; i < nums.length; i++) {
            some = nums[i] ^ some;
            System.out.println(some );
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println(new Solution().containsDuplicate(new int[]{900,1,15,16900, 900}));
//        System.out.println(new Solution().containsDuplicate(new int[]{0, 1, 2, 3, 4, 0}));
    }
}