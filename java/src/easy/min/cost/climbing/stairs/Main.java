package easy.min.cost.climbing.stairs;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
    }

//    10,15,20
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];

        dp[0] = cost[0];
        dp[1] = cost[1];

        for(int i = 2; i < cost.length; i++){
            dp[i] = cost[i] + Math.min(dp[i-2], dp[i-1]);
        }
        return Math.min(dp[cost.length-1], dp[cost.length-2]);
    }
}
