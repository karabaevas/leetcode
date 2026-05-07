package leetcode;

public class Ex1464 {
    public static void main(String[] args) {
        Ex1464 main = new Ex1464();



    }

//    max product
//    +-----  min min
//    -+++++  max max
//    +++---  max max | min min
//    ++++++  max max
//    ------  min min
//
//    min product
//    +-----  MAX MIN
//    -+++++  MAX MIN
//    +++---  MAX MIN
//    ++++++  MIN MIN
//    ------  MAX MAX

    public int maxProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            if(max1 < cur){
                max2 = max1;
                max1 = cur;
            } else {
                if (max2 < cur){
                    max2 = cur;
                }
            }

            if(min1 > cur){
                min2 = min1;
                min1 = cur;
            } else {
                if (min2 > cur){
                    min2 = cur;
                }
            }
        }

        return Math.max(min1 * min2, max1 * max2);
    }


}
