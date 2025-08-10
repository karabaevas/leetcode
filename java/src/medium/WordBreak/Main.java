package medium.WordBreak;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        System.out.println(main.wordBreak("penapplepen", List.of("pen", "apple")));

    }

    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        Set<String> dict = new HashSet<>(wordDict);

        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                String substring = s.substring(j, i);
                if (dp[j] && dict.contains(substring)){
                    dp[i] = true;

                    break;
                }
            }
        }

        return dp[s.length()];

    }

}
