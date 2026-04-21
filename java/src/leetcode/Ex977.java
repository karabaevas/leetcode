package leetcode;

public class Ex977 {
    public static void main(String[] args) {
        Ex977 main = new Ex977();



    }

    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        int idx = nums.length-1;

        while(left <= right){
            int lval = nums[left]*nums[left];
            int rval = nums[right]*nums[right];

            if(lval > rval){
                res[idx] = lval;
                left++;
            } else {
                res[idx] = rval;
                right--;
            }
            idx--;
        }

        return res;
    }


}
