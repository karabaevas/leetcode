package easy.ValidParentheses;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class Solution {
    Map<Character, Character> map = new HashMap<>();
    {
        map.put('[', ']');
        map.put('{', '}');
        map.put('(', ')');
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
    }

    public boolean isValid(String s) {
        LinkedList<Character> chars = new LinkedList<>();
        for (int i = 0; i < s.toCharArray().length; i++) {
            char ch = s.charAt(i);
            if (ch == '[' || ch == '(' || ch == '{') {
                chars.push(ch);
            } else {
                if (chars.isEmpty()){
                    return false;
                }
                if(!map.get(ch).equals(chars.pollFirst())){
                    return false;
                }
            }
        }


        return chars.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isValid("["));
//        System.out.println(new Solution().isValid(""));
//        System.out.println(new Solution().isValid("[]"));
//        System.out.println(new Solution().isValid("{}"));
//        System.out.println(new Solution().isValid("()"));
//        System.out.println(new Solution().isValid(")("));
//        System.out.println(new Solution().isValid("(())"));
//        System.out.println(new Solution().isValid("(){}"));
//        System.out.println(new Solution().isValid("(){}"));
//        System.out.println(new Solution().isValid("({{[[]]}[]}{})"));
    }
}