package yandex.custom.f1;

public class Ex10 {
    public static void main(String[] args) {
        Ex10 main = new Ex10();


    }
}

class NumArray {
    int[] arr;
    int[] prefix;

    public NumArray(int[] nums) {
        arr = nums;
        int n = nums.length;
        prefix = new int[n];

        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return prefix[right];
        }
        return prefix[right] - prefix[left - 1];
    }
}