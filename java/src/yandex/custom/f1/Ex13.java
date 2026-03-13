package yandex.custom.f1;

public class Ex13 {
    public static void main(String[] args) {
        Ex13 main = new Ex13();
        System.out.println(main.waysToSplitArray(new int[]{1, 2, 3, 4}));
    }

    public int waysToSplitArray(int[] nums) {
        if (nums.length <= 1) {
            return 0;
        }

        long[] sl = new long[nums.length];
        long[] sp = new long[nums.length];

        sl[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sl[i] = sl[i - 1] + nums[i];
        }

        sp[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            sp[i] = sp[i + 1] + nums[i];
        }

        int result = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (sl[i] >= sp[i + 1]) {
                result++;
            }
        }
        return result;
    }
}
