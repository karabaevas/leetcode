package medium.besttimetobuyandsellstockii;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println();
    }

    public int maxProfit(int[] prices) {
        int result = 0;

        for (int i = 0; i < prices.length-1; i++){
            int diff = prices[i + 1] - prices[i];
            if (diff>0){
                result = result + diff;
            }
        }

        return result;
    }
}
