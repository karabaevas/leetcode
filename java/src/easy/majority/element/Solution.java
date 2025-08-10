package easy.majority.element;

class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().majorityElement(new int[]{}));
    }

    public int majorityElement(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return nums[0];
        }

        int candidate = nums[0];
        int metCounter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == candidate){
                metCounter++;
            } else {
                metCounter--;
            }
            if (metCounter == 0){
                candidate = nums[i];
                metCounter = 1;
            }
        }

        return candidate;
    }

    public void doDirt(){

    }
}