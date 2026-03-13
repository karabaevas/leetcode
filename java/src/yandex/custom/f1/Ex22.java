package yandex.custom.f1;

import java.util.HashMap;
import java.util.Map;

public class Ex22 {
    public static void main(String[] args) {
        Ex22 main = new Ex22();

//        main.lengthOfLongestSubstring("abcabcbb");
//        main.lengthOfLongestSubstring("pwwkew");
        main.lengthOfLongestSubstring("dvdf");
//        main.lengthOfLongestSubstring("abba");


    }

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> storage = new HashMap<>();
        int result = 0;
        int left = 0;
        int right = 0;

        while(right < s.length()){
            char cur = s.charAt(right);

            if(storage.containsKey(cur)){
                left = Math.max(storage.get(cur)+1, left);
            }

            storage.put(cur, right);
            result = Math.max(right-left+1, result);
            right++;
        }
        return result;
    }

}
