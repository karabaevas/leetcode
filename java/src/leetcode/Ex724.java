package leetcode;

public class Ex724 {
    public static void main(String[] args) {
        Ex724 main = new Ex724();
    }

    public int pivotIndex(int[] nums) {
        int[] leftsum = new int[nums.length];
        int[] rightsum = new int[nums.length];

        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
            leftsum[i] = sum;
        }

        sum = 0;
        for(int i = nums.length-1; i>=0; i--){
            sum += nums[i];
            rightsum[i] = sum;
        }

        for(int i = 0; i<nums.length; i++){
            int left = 0;
            int right = 0;
            if(i != 0){
                left = leftsum[i-1];
            }

            if(i != nums.length-1){
                right = rightsum[i+1];
            }

            if(left == right)
                return i;
        }

        return -1;
    }

}