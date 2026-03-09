package yandex.f1;

public class Ex21 {
    public static void main(String[] args) {
        Ex21 main = new Ex21();



    }

    public int maxProfit(int[] prices) {
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        int[] buyprice = new int[prices.length];
        int[] sellprice = new int[prices.length];

        for(int i=0; i<prices.length; i++){
            if(prices[i]<minVal){
                minVal = prices[i];
            }
            buyprice[i] = minVal;
        }

        for(int i=prices.length-1; i>=0; i--){
            if(prices[i]>maxVal){
                maxVal = prices[i];
            }
            sellprice[i]=maxVal;
        }

        int diff = 0;
        for(int i =0; i< prices.length; i++){
            diff = Math.max(sellprice[i] - buyprice[i], diff)    ;
        }

        return diff;
    }


}
