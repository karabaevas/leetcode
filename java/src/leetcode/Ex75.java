package leetcode;

public class Ex75 {
    public static void main(String[] args) {
        Ex75 main = new Ex75();



    }



    public void sortColors(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int i = l+1;

        while(i <= r){
            if(nums[i] == 0){
                swap(l, i, nums);
                l++;
                i++;
            } else if(nums[i] == 2){
                swap(i, r, nums);
                r--;
            } else {
                i++;
            }
        }
    }


    void swap(int from, int to, int[] nums){
        int tmp = nums[to];
        nums[to] = nums[from];
        nums[from] = tmp;
    }
}
