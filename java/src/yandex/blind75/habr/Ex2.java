package yandex.blind75.habr;

public class Ex2 {
    public static void main(String[] args) {
        Ex2 main = new Ex2();
    }

    public int longestSubarray(int[] nums) {
        int l = 0;
        int r = 0;
        int zeros = 0;
        int res = 0;
        while(r < nums.length ){
            if(nums[r] == 0){
                zeros++;
            }

            while(zeros > 1){
                if(nums[l] == 0){
                    zeros--;
                }
                l++;
            }

            res = Math.max(res, r-l);
            r++;
        }

        return res;
    }
}
