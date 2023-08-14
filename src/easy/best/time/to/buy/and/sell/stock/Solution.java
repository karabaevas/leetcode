package easy.best.time.to.buy.and.sell.stock;

import java.math.BigDecimal;

class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1)
            return 0;

        int[] maxArr = new int[prices.length];
        int[] minArr = new int[prices.length];

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            int min1 = Math.min(prices[i], min);
            minArr[i] = min1;
            min = min1;
        }

        int max = 0;
        for (int i = prices.length - 1; i >= 0; i--) {
            int max1 = Math.max(prices[i], max);
            maxArr[i] = max;
            max = max1;
        }

        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            result = Math.max(maxArr[i] - minArr[i], result);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] prices0 = {7, 1, 5, 3, 6, 4};
        int[] prices1 = {7, 6, 4, 3, 1};
        int[] prices2 = {1, 4, 2};
        int[] prices3 = {3, 2, 6, 5, 0, 3};
        int[] prices4 = {2, 7, 1, 4};

        System.out.println(new Solution().maxProfit(prices0));
    }
}