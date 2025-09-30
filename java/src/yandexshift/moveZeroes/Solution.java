package yandexshift.moveZeroes;

class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = 1;
        if (nums.length < 2) {
            return;
        }

        while (right < nums.length) {
            if (nums[left] == 0 && nums[right] != 0) {
                nums[left] = nums[right];
                nums[right] = 0;
                left++;
                right++;
                continue;
            }
            if (nums[right] == 0 && nums[left] != 0) {
                left++;
                right++;
                continue;
            }
            if (nums[right] == 0 && nums[left] == 0) {
                right++;
                continue;
            }
            if (nums[right] != 0 && nums[left] != 0) {
                left++;
                right++;
            }
        }
    }
}