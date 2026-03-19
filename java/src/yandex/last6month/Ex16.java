package yandex.last6month;

public class Ex16 {
    public static void main(String[] args) {
        Ex16 main = new Ex16();
    }

    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int result = 0;
        int counter = 0;
        for(int r = 0; r< nums.length; r++){
            if(nums[r] == 0){
                counter++;
                while(counter > k){
                    if(nums[l] == 0){
                        counter--;
                    }
                    l++;
                }
            }

            result = Math.max(result, r-l+1);
        }

        return result;
    }


}
