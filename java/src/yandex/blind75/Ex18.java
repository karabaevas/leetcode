package yandex.blind75;

public class Ex18 {
    public static void main(String[] args) {
        Ex18 main = new Ex18();



    }

    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int m = (r+l)/2;

        while(r-l>1){
            int lval = nums[l];
            int rval = nums[r];
            int mval = nums[m];

            if(lval < rval){
                return lval;
            }

            if(lval < mval){
                l = m;
                m = (r+l)/2;
            } else {
                r = m;
                m = (r+l)/2;
            }
        }

        return Math.min(nums[l], nums[r]);
    }


}
