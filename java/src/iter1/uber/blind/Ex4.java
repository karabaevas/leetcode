package iter1.uber.blind;

public class Ex4 {

//    https://leetcode.com/problems/product-of-array-except-self/

    public int[] productExceptSelf(int[] nums) {
        int[] lar = new int[nums.length];
        int[] rar = new int[nums.length];
        int[] res = new int[nums.length];

        for(int i = 0; i< nums.length; i++){
            if(i == 0){
                lar[i] = 1;
            } else {
                lar[i] = nums[i-1] * lar[i-1];
            }
        }

        for(int i = nums.length-1; i>=0 ; i--){
            if(i == nums.length-1){
                rar[i] = 1;
            } else {
                rar[i] = nums[i+1] * rar[i+1];
            }
        }


        for(int i = 0; i< nums.length; i++){
            res[i] = lar[i] * rar[i];
        }

        return res;
    }
}
