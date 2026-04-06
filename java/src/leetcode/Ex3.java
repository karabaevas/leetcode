package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Ex3 {
    public static void main(String[] args) {
        Ex3 main = new Ex3();



    }

    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;

        Map<Character, Integer> map =  new HashMap<>();
        int result = 0;
        while(right < s.length()){
            char rChar = s.charAt(right);
            Integer rFreq = map.getOrDefault(rChar, 0);
            rFreq++;
            map.put(rChar, rFreq);

            while(map.get(rChar) > 1){
                char lChar = s.charAt(left);
                Integer lFreq = map.get(lChar);
                lFreq--;
                map.put(lChar, lFreq);
                left++;
            }

            result = Math.max(result, right - left + 1);
            right++;
        }

        return result;
    }

}
