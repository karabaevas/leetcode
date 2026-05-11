package leetcode;

public class Ex283 {
    public static void main(String[] args) {
        Ex283 main = new Ex283();
    }

    public void moveZeroes(int[] nums) {
        int inspos = 0;
        for (int i = 0; i< nums.length; i++){
            if(nums[i] != 0){
                nums[inspos] = nums[i];
                inspos++;
            }
        }

        while(inspos < nums.length){
            nums[inspos] = 0;
            inspos++;
        }
    }

}
