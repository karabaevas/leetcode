package medium.longestsubarrayof1sAfterDeletingOneElement;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.longestSubarray(new int[]{1, 1, 0, 1}));
        System.out.println(main.longestSubarray(new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1}));
        System.out.println(main.longestSubarray(new int[]{1, 1, 1}));
        System.out.println(main.longestSubarray(new int[]{1, 0, 0, 0, 0}));
        System.out.println(main.longestSubarray(new int[]{1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1}));
        System.out.println(main.longestSubarray(new int[]{1, 1, 0, 0}));
        System.out.println(main.longestSubarray(new int[]{1,1,0,0,1,1,1,0,1}));
    }

    public int longestSubarray(int[] nums) {
        int zeros = 0;
        int leftIndex = 0;
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeros++;
            }
            if (zeros > 1) {
                while (zeros != 1) {
                    if (nums[leftIndex] == 0) {
                        zeros--;
                    }
                    leftIndex++;
                }
            }

            ans = Math.max(ans, i - leftIndex);
        }

        return ans;
    }
}
