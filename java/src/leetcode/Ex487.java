package leetcode;

public class Ex487 {
    public static void main(String[] args) {
        Ex487 main = new Ex487();



    }

    public int findMaxConsecutiveOnes(int[] nums){
        int l = 0;
        int r = 0;

        int edits = 0;
        int res = 0;

        while(r < nums.length){
            if(nums[r] == 0){
                edits++;
            }

            while(edits >1){
                if(nums[l] == 0){
                    edits--;
                }
                l++;
            }

            res = Math.max(r-l+1, res);
            r++;
        }

        return res;
    }

}
