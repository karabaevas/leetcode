package easy.LongestCommonPrefix;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().longestCommonPrefix(new String[]{"car"}));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String shortest = strs[0];
        for (String str : strs) {
            if (str.length() < shortest.length()) {
                shortest = str;
            }
        }

        for (int i = 0; i < shortest.toCharArray().length; i++) {
            for (String str : strs) {
                if (str.charAt(i) != shortest.charAt(i)) {
                    return shortest.substring(0, i);
                }
            }
        }

        return shortest;
    }
}
