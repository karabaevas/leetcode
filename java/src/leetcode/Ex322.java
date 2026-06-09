package leetcode;

import java.util.Arrays;

public class Ex322 {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        int INF = Integer.MAX_VALUE;
        Arrays.fill(dp, INF);
        dp[0] = 0;

        for(int i = 1; i< dp.length; i++){
            for(int coin: coins){
                if(i >= coin){
                    if(dp[i-coin] != INF){
                        dp[i] = Math.min(dp[i-coin]+1, dp[i]);
                    }
                }
            }
        }

        return dp[amount] == INF ? -1 : dp[amount];
    }


}
