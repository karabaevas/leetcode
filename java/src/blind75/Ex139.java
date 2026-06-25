package blind75;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex139 {
    class Solution {
        public boolean wordBreak(String s, List<String> wordDict) {
            return doCheck(0, s, wordDict, new Boolean[s.length()]);
        }


        boolean doCheck(int start, String s, List<String> wordDict, Boolean[] memo){
            if(start == s.length()){
                return true;
            }

            if(memo[start] != null){
                return memo[start];
            }

            for(String word: wordDict){
                if(start + word.length()-1 >= s.length()){
                    continue;
                }

                if(s.substring(start, start + word.length()).equals(word)){
                    boolean res = doCheck(start + word.length(), s, wordDict, memo);
                    if(res){
                        return res;
                    }
                }

                memo[start] = false;
            }

            return false;
        }
    }

}
