package iter1.uber.blind;

public class Ex5 {


//    improved
//    https://leetcode.com/problems/product-of-array-except-self/

    public int[] productExceptSelf(int[] nums) {
        int[] lar = new int[nums.length];
        int[] res = new int[nums.length];

        lar[0] = 1;
        for(int i = 1; i< nums.length; i++){
            lar[i] = nums[i-1] * lar[i-1];
        }


//        res[nums.length-1] = lar[nums.length-1];
        int suf = 1;
        res[nums.length-1] = lar[nums.length-1];
        for(int i = nums.length-2; i >= 0; i--){
            suf = suf * nums[i+1];
            res[i] = suf* lar[i];
        }

        return res;
    }
}
