package easy.plusone;

import java.util.Arrays;

class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] == 9){
                digits[i] = 0;
                if (i == 0){
                    int[] result = new int[digits.length+1];
                    for (int i1 = 1; i1 < result.length; i1++) {
                        result[i1] = 0;
                    }
                    result[0] = 1;
                    return result;
                }
            } else {
                digits[i] = digits[i] + 1;
                return digits;
            }
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] ints = {1,2,0};
        int[] x = new Solution().plusOne(ints);
        System.out.println(Arrays.toString(x));
    }

}