package easy.MissingNumber;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().missingNumber(new int[] {0, 1, 2, 3, 5, 6, 4, 8}));
    }

    public int missingNumber(int[] nums) {
        int xor = 0;

        for (int num : nums) {
            xor = xor ^ num;
        }

        for (int i = 0; i <= nums.length; i++) {
            xor = xor ^ i;
        }

        return xor;
    }
}
