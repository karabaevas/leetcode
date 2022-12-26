package easy.LongestCommonPrefix;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().longestCommonPrefix(new String[]{"flower","flow","flight", "tratata"}));
    }

    public String longestCommonPrefix(String[] strs) {
        String test = strs[0];
        for (String str : strs) {
            while (str.indexOf(test) != 0){
                test = test.substring(0, test.length()-1);
            }
        }

        return test;
    }
}
