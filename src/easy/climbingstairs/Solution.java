package easy.climbingstairs;

import java.math.BigDecimal;

class Solution {
    public int climbStairs(int n) {
        int once = n;
        int twice = 0;
        int result = 0;

        while (once>=0){
            BigDecimal fact = fact(once + twice);
            result += (fact.divide(fact(once)).divide(fact(twice))).intValue();
            twice++;
            once = once -2;
        }

        return result;
    }

    public BigDecimal fact(int i){
        BigDecimal f = new BigDecimal(1);
        for (int j = 2; j <= i; j++) {
            f = f.multiply(new BigDecimal(j));
        }
        return f;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().climbStairs(45));
    }
}