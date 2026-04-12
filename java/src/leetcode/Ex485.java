package leetcode;

public class Ex485 {
    public static void main(String[] args) {
        Ex485 main = new Ex485();



    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int right = 0;
        int res = 0;
        while(right < nums.length) {
            int start = right;
            while(right < nums.length  && nums[right] != 0){
                res = Math.max(res, right - start+1);
                right++;
            }

            right++;
        }

        return res;
    }

}
