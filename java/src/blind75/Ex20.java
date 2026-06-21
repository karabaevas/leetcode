package blind75;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Ex20 {
    public boolean isValid(String s) {
        if(s.length() %2 != 0){
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        map.put(']','[');
        map.put(')','(');
        map.put('}','{');

        Stack<Character> stack = new Stack<>();

        for(char ch: s.toCharArray()){
            if(ch == '[' || ch == '(' || ch == '{'){
                stack.push(ch);
            } else {
                Character open = map.get(ch);
                if(stack.isEmpty() || open != stack.pop()){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }


}
