package easy.longestStrictlyIncreasingOrStrictlyDecreasingSubarray;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.longestMonotonicSubarray(new int[]{ 1,2 }));
        System.out.println(main.longestMonotonicSubarray(new int[]{ 1,4,3,3,2 }));
        System.out.println(main.longestMonotonicSubarray(new int[]{ 3,3,3 }));
        System.out.println(main.longestMonotonicSubarray(new int[]{ 1,2,3 }));
        System.out.println(main.longestMonotonicSubarray(new int[]{ 3,2,1 }));
    }

    public int longestMonotonicSubarray(int[] nums) {
        if (nums.length <= 1){
            return nums.length;
        }

        int incCombo = 1;
        int decCombo = 1;
        int res = 1;

//        inc
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] < nums[i+1]) {
                incCombo++;
                res = Math.max(incCombo, res);
            }
            else {
                incCombo = 1;
            }
        }

//        dec
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] > nums[i+1]) {
                decCombo++;
                res = Math.max(decCombo, res);
            }
            else {
                decCombo = 1;
            }
        }

        return res;
    }
}
