package easy.LongestSubstringWithoutRepeatingCharacters;

import java.util.*;

class Solution {
    public static void main(String[] args) {
//        System.out.println(new Solution().lengthOfLongestSubstring("abcabcbb"));
        System.out.println(new Solution().lengthOfLongestSubstring("aab"));
//        System.out.println(new Solution().lengthOfLongestSubstring("  "));
//        System.out.println(new Solution().lengthOfLongestSubstring("eapiahdrjgtgyurbfhzlfsjmucymimwmonupuxideblevcfdkhorbzevecjmrfzfutworhtxiebgjijtrzksbqpfvzrmgqtb"));
//        System.out.println(new Solution().lengthOfLongestSubstring(""));
    }

    public int lengthOfLongestSubstring(String s) {
        int maxLength = 1;
        int curIndex = 0;
        int result = 0;
        if (s.length()==0 || s.length() == 1)
            return s.length();

        String substring;
        do {
            substring = s.substring(curIndex, curIndex + maxLength);
            if (substring.length() == new HashSet<>(Arrays.asList(substring.split(""))).size()) {
                result = maxLength;
                maxLength++;
            } else {
                curIndex = curIndex + 1;
            }
        } while (curIndex + maxLength <= s.length() );

        return result;
    }
}