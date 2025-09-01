package yandexshift.lengthOfLongestSubstring;

import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        Example main = new Example();
        System.out.println(main.lengthOfLongestSubstring("bbb"));
        System.out.println(main.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(main.lengthOfLongestSubstring("abba"));
    }

//    bbb
//    abcabcbb
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) {
            return s.length();
        }
        int left = 0;
        int right = 0;

        int result = 1;
        Map<Character, Integer> map = new HashMap<>();
        while (right < s.length()) {
            char c = s.charAt(right);
            Integer index = map.get(c);
            if (index != null) {
                for (int i = left; i < index+1; i++) {
                    map.remove(s.charAt(i));
                }
                left = index + 1;
                map.put(c, right);
            } else {
                map.put(c, right);
            }
            result = Math.max(result, right - left +1);
            right++;
        }

        return result;
    }
}
