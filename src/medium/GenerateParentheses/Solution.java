package medium.GenerateParentheses;

import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        Set<String> result = new HashSet<>();
        generate(result, "", n, 0);
        return new ArrayList<>(result);
    }

    private void generate(Set<String> result, String s, int n, int open) {
        if (n==0){
            while (open>0){
                s = s + ")";
                open--;
            }
            result.add(s);
            return;
        }

        generate(result, s + "(", n - 1, open+1);
        if (open>0){
            generate(result, s+")", n, open -1);
        }
    }


    public static void main(String[] args) {
        System.out.println(new Solution().generateParenthesis(4));
    }
}