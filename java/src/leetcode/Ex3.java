package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Ex3 {
    public static void main(String[] args) {
        Ex3 main = new Ex3();



    }

    /**
     * Для заданной строки найти длину наибольшей подстроки без
     * повторяющихся символов.
     * Например:
     * abcabcbbddee -> 3 (abc)
     * bbbbb -> 1 (b)
     * pwwkew -> 3 (wke)
     * pwwkewpwwkew -> 4 (kewp)
     */

    public int findLengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int res = 0;
        int l = 0;
        for(int r = 0; r< s.length(); r++){
            char curR = s.charAt(r);
            int counter = map.getOrDefault(curR, 0) + 1;
            map.put(curR, counter);

            while(map.get(curR) > 1){
                char curL = s.charAt(l);
                int counterL = map.get(curL) - 1;
                if(counterL == 0){
                    map.remove(curL);
                } else {
                    map.put(curL, counterL);
                }

                l++;
            }

            res = Math.max(res, r-l+1);
        }

        return res;
    }

}
