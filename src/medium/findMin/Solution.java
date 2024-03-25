package medium.findMin;

class Solution {
    public int findMin(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }
        if (nums.length == 2){
            return Math.min(nums[0], nums[1]);
        }

        int l = 0;
        int r = nums.length - 1;

        return findMinInternal(l, r, nums);

    }

    public int findMinInternal(int l, int r, int[] nums){
        if (r - l == 0){
            return nums[r];
        }
        if (r - l == 1){
            return Math.min(nums[r], nums[l]);
        }

        int m = (r-l)/2 + l;
        int lVal = nums[l];
        int rVal = nums[r];
        int mVal = nums[m];

        if (lVal < mVal && mVal < rVal){
            return lVal;
        }

        if (rVal < lVal && lVal < mVal){
            return findMinInternal(m, r, nums);
        }
        else {
            return findMinInternal(l, m, nums);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().findMin(new int[] {1,7,0}));
    }
}