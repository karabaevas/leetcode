package easy.sqrt;

class Solution {
    public int mySqrt(int x) {
        if (x == 0 ) return 0;
        if (x == 1 || x == 2 || x == 3) return 1;

        int max = x/2;
        int min = 0;

        while (max - min > 1) {
            int mid = (min + max)/2;
            int ans = x / mid;
            if (ans == mid){
                return mid;
            }
            if (ans < mid) {
                max = mid;
            } else {
                min = mid;
            }
        }

        if (x / max == max) return max;
        return min;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().mySqrt(15));
    }
}
