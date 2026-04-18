package leetcode;

public class Ex33 {
    public static void main(String[] args) {
        Ex33 main = new Ex33();



    }

    //  1 2 3 4 5 6
    //  5 6 1 2 3 4
    //  3 4 5 6 1 2
    //  2 3 4 5 6 1

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int m = 0;
        if(nums.length == 1){
            return nums[0] == target ? 0 : -1;
        }

        while (left<right){
            m = (right + left)/2;
            if(nums[m] == target){
                return m;
            }
            if(nums[right] == target){
                return right;
            }

            if(nums[left] < nums[m]){
                if(nums[left] <= target && nums[m] >= target){
                    right = m;
                } else {
                    left = m+1;
                }
            } else {
                if(nums[m] <= target && nums[right] >= target){
                    left = m+1;
                } else {
                    right = m;
                }
            }
        }
        return -1;

    }

}
