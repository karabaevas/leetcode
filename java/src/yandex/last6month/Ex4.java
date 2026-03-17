package yandex.last6month;

public class Ex4 {
    public static void main(String[] args) {
        Ex4 main = new Ex4();



    }

    public void moveZeroes(int[] nums) {
        int left = 0;
        for (int i = 0; i< nums.length;i++){
            if(nums[i] != 0){
                int tmp = nums[i];
                nums[i] = nums[left];
                nums[left] = tmp;
                left++;
            }
        }
    }


}
