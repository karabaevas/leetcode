package medium.searchinrotatedsortedarray;

class Solution {

    public int search(int[] nums, int target) {
        if (nums.length==1){
            return nums[0] == target? 0 : -1;
        }

        int left = 0;
        int right = nums.length - 1;
        int shift =0;

        if (nums[0] > nums[nums.length-1]){
            while (left != right) {
                int middle = (left + right) / 2;
                if (nums[middle] > nums[left]) {
                    left = middle;
                } else if (nums[middle] <= nums[left]) {
                    right = middle;
                }
            }

            shift = left+1;
            if (target == nums[shift]) return shift;
            if (target>=nums[0]){
                left = 0;
                right = shift-1;
            } else {
                left = shift;
                right = nums.length-1;
            }
        }

        do {
            if (nums[left] == target) return left;
            if (nums[right] == target) return right;
            if (left + 1 == right || left == right) return -1;
            int middle = (left + right) / 2;
            if (nums[middle] > target) {
                right = middle;
            } else if (nums[middle] <= target) {
                left = middle;
            }
        }while (left != right);

        return left == target? target : -1;
    }

    public static void main(String[] args) {
        int[] a = {3,5,1};

        System.out.println(new Solution().search(a, 2));
    }
}
