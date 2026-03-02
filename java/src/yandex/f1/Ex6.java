package yandex.f1;

public class Ex6 {
    public static void main(String[] args) {
        Ex6 main = new Ex6();

        main.productExceptSelf(new int[]{1,2,3});
    }


    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }
        if (nums.length == 1) {
            return nums;
        }

        int[] pref = new int[nums.length];
        int[] suf = new int[nums.length];
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                pref[i] = nums[i];
                continue;
            }
            pref[i] = nums[i] * pref[i - 1];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1) {
                suf[i] = nums[i];
                continue;
            }
            suf[i] = suf[i + 1] * nums[i];
        }


        for (int i = 0; i < nums.length; i++) {
            if (i == 0){
                res[i] = suf[i+1];
                continue;
            }
            if (i == nums.length-1){
                res[i] = pref[i-1];
                continue;
            }

            res[i] = pref[i-1]*suf[i+1];
        }

        return res;
    }


}


//
//
//public int[] productExceptSelf(int[] nums) {
//    int[] left = new int[nums.length];
//    int[] right = new int[nums.length];
//    int[] result = new int[nums.length];
//
//    left[0] = 1;
//    right[nums.length - 1] = 1;
//
//    for (int i = 1; i < nums.length; i++) {
//        left[i] = left[i - 1] * nums[i-1];
//    }
//
//    for (int i = nums.length - 2; i >= 0; i--) {
//        right[i] = nums[i+1] * right[i + 1];
//    }
//
//    for (int i = 0; i < nums.length; i++) {
//        result[i] = left[i] * right[i];
//    }
//
//    return result;
//}