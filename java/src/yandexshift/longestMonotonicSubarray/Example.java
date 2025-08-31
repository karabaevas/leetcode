package yandexshift.longestMonotonicSubarray;

public class Example {
    public static void main(String[] args) {
        Example main = new Example();
        System.out.println();
    }

//    3,3,3,3,3
//    1,2,3,4,3
//    4,3,2,1,3
    public int longestMonotonicSubarray(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }

        int incSubArrayLength = 1;
        int decSubArrayLength = 1;
        int result = 1;

        for (int i = 0; i < nums.length-1; i++) {
            int current = nums[i];
            int next = nums[i + 1];


            if (current < next) {
                incSubArrayLength++;
                decSubArrayLength = 1;
            }
            if (current > next) {
                decSubArrayLength++;
                incSubArrayLength = 1;
            }
            if (current == next) {
                decSubArrayLength = 1;
                incSubArrayLength = 1;
            }

            result = Math.max(incSubArrayLength, result);
            result = Math.max(decSubArrayLength, result);
        }

        return result;
    }
}
