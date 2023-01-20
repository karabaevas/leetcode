package medium.stringtointegeratoi;

import java.util.HashMap;

class Solution {
    public int myAtoi(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('0', 0);
        map.put('1', 1);
        map.put('2', 2);
        map.put('3', 3);
        map.put('4', 4);
        map.put('5', 5);
        map.put('6', 6);
        map.put('7', 7);
        map.put('8', 8);
        map.put('9', 9);

        int result = 0;
        boolean isNegative = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            Integer value = map.get(c);
            if (value != null) {
                result = result * 10 + value;
            } else {
                if (c == '-') {
                    isNegative = true;
                } else {
                    if (c != ' ' && value == null && result == 0) {
                        return 0;
                    }
                }
            }


        }

        return isNegative ? result * -1 : result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().myAtoi("words and 987"));
    }
}