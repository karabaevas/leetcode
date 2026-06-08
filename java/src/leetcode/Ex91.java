package leetcode;

public class Ex91 {
    public static void main(String[] args) {
        Ex91 main = new Ex91();



    }
    public int numDecodings(String s) {
        if(s.length() == 0 || s.charAt(0) == '0'){
            return 0;
        }

        int[] dp = new int[s.length()+1];

        dfs(s, 0, dp);

        return dp[0];
    }

    int dfs(String s, int i, int[] dp){
        if(i == s.length()){
            return 1;
        }

        if(i > s.length() || s.charAt(i) == '0'){
            return 0;
        }

        if(dp[i] != 0){
            return dp[i];
        }

        int ways = dfs(s, i+1, dp);

        if(i+1 < s.length()){
            int twoNums = (s.charAt(i)-'0') * 10 + (s.charAt(i+1)-'0');
            if(twoNums > 9 && twoNums < 27){
                ways += dfs(s, i+2, dp);
            }
        }

        dp[i] = ways;

        return ways;
    }


}
