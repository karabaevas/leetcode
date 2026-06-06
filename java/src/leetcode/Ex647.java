package leetcode;

public class Ex647 {
    public static void main(String[] args) {
        Ex647 main = new Ex647();



    }

    public int countSubstrings(String s) {
        int res = 0;

        int[][] dp = new int[s.length()][s.length()];

        for(int i = 0; i< s.length(); i++){
            dp[i][i] = 1;
            res++;
        }

        for(int i = 0; i<s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                dp[i][i+1] = 2;
                res++;
            }
        }


        for(int len = 3; len <= s.length(); len++){
            for(int i = 0; i<=s.length()-len; i++){
                int j = i + len - 1;
                if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1] != 0){
                    dp[i][j] = dp[i+1][j-1]+2;
                    res++;
                }
            }
        }

        return res;
    }


}
