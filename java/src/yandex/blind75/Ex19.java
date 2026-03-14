package yandex.blind75;

public class Ex19 {
    public static void main(String[] args) {
        Ex19 main = new Ex19();



    }

    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        int m = (r+l)/2;

        if(nums.length == 1){
            if(nums[0] == target){
                return 0;
            } else {
                return -1;
            }
        }

        while(r-l>1){
            int lval = nums[l];
            int rval = nums[r];
            int mval = nums[m];

            if(lval == target){
                return l;
            }
            if(rval == target){
                return r;
            }
            if(mval == target){
                return m;
            }

            if(lval < mval){
                if(lval<= target && mval >= target) {
                    r = m;
                    m = (r + l)/2;
                    continue;
                }
                else {
                    l = m;
                    m = (r + l)/2;
                    continue;
                }
            }
            else {
                if(mval<= target && rval >= target) {
                    l = m;
                    m = (r + l)/2;
                    continue;
                }
                else {
                    r = m;
                    m = (r + l)/2;
                }
            }
        }

        int lval = nums[l];
        int rval = nums[r];
        int mval = nums[m];
        if(lval == target){
            return l;
        }
        if(rval == target){
            return r;
        }
        if(mval == target){
            return m;
        }
        return -1;
    }


}
