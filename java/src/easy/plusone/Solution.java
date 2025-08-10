package easy.plusone;

import java.util.Arrays;

class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
           if (digits[i] != 9){
               digits[i]++;
               return digits;
           }
           digits[i] = 0;
        }

        int[] result = new int[digits.length+1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] ints = {1,2,0};
        int[] x = new Solution().plusOne(ints);
        System.out.println(Arrays.toString(x));
    }

}