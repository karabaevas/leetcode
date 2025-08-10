package medium.reversenumber;

class Solution {
    public int reverse(int x) {
        int result = 0;
        while (x!=0){
            int resultBefore = result;
            int i = x % 10;
            result = result*10 + i;
            x = x/10;

            if (result / 10 != resultBefore){
                return 0;
            }
        }


        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().reverse(1534236469));
    }
}