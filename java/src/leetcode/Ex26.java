package leetcode;

public class Ex26 {
    public static void main(String[] args) {
        Ex26 main = new Ex26();



    }

    public int removeDuplicates(int[] nums) {
        int left = 0;
        int right = 0;

        while(right < nums.length) {
            int lval = nums[left];
            int rval = nums[right];

            if(lval == rval){
                right++;
            } else {
                left++;
                nums[left] = rval;
                right++;
            }
        }

        return left+1;
    }

}
