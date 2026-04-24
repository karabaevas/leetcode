package leetcode;

public class Ex27 {
    public static void main(String[] args) {
        Ex27 main = new Ex27();



    }

    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = 0;
        while(right < nums.length){
            if(nums[left] == val){
                while(right < nums.length && nums[right] == val){
                    right++;
                }
                if(right < nums.length){
                    nums[left] = nums[right];
                    nums[right] = val;

                    left++;
                    right++;
                }else {
                    break;
                }
            } else {
                left++;
                right++;
            }
        }

        return left;
    }


}
