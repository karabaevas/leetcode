package easy.removeDuplicatesFromSortedArray;

class Solution {
    public int removeDuplicates(int[] nums) {
        int EMPTY_VALUE = -101;

        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }

        int i = 0;
        int j = 0;
        while (true) {
            if (nums[i] == nums[i + 1]) {
                System.arraycopy(nums, i + 1, nums, i, nums.length - i - 1);
                nums[nums.length - 1 - j] = EMPTY_VALUE;
                j++;
            } else {
                i++;
            }

            if (nums[i] == EMPTY_VALUE) return i;
            if (i == nums.length - 1) return nums.length;
            if (nums[i + 1] == EMPTY_VALUE) return i + 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().removeDuplicates(new int[]{0, 0, 1}));
        System.out.println(new Solution().removeDuplicates(new int[]{0, 0, 0, 0, 0, 5}));
        System.out.println(new Solution().removeDuplicates(new int[]{0, 0, 1, 1, 2, 2, 2, 2, 2, 3, 3, 4, 4, 5}));
        System.out.println(new Solution().removeDuplicates(new int[]{0, 1, 2, 3, 4, 5, 6, 7}));

        System.out.println(new Solution().removeDuplicates(new int[]{1, 2, 2}));
    }

}