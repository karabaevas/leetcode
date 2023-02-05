package medium.powxn;


class Solution {
    public double myPow(double x, int n) {
        long copyn = n;
        boolean isNegative = copyn < 0;
        if (x == 1) return 1;
        copyn = isNegative ? copyn * (-1) : copyn;

        long currentPow = 1;
        double currentVal = x;

        long incPow = 1;
        long decPow = 1;
        double incVal = x;
        double decVal = x;

        while (copyn != currentPow){
            if (currentPow<copyn){
                decPow = 1;
                decVal = x;

                currentVal = currentVal * incVal;
                currentPow = currentPow + incPow;

                incVal = incVal * incVal;
                incPow = incPow + incPow;
            } else {
                incPow = 1;
                incVal = x;

                currentVal = currentVal / decVal;
                currentPow = currentPow - decPow;

                decVal = decVal * decVal;
                decPow = decPow + decPow;
            }
        }


        return isNegative? 1/currentVal :currentVal;
    }

    public static void main(String[] args) {
        double v = new Solution().myPow(2.0f, Integer.MAX_VALUE);
        System.out.println(v);
    }
}