package blind75;

public class Ex121 {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int res = 0;

        for (int price : prices) {
            min = Math.min(price, min);

            res = Math.max(res, price - min);
        }
        return res;
    }
}
