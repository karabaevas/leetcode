package medium.minimumRemoveValidPrant;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

//        main.minRemoveToMakeValid("lee(t(c)o)de)");
        System.out.println(main.minRemoveToMakeValid("a()"));
    }


    public String minRemoveToMakeValid(String s) {
        if (s.isEmpty()) {
            return s;
        }

        StringBuilder sb = new StringBuilder();
        int counter = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char item = s.charAt(i);
            if (item == '(') {
                counter++;
            }
            if (item == ')') {
                if (counter > 0) {
                    counter--;
                } else {
                    continue;
                }
            }
            stack.push(item);
        }

        counter = 0;
        while (!stack.isEmpty()) {
            Character item = stack.pop();
            if (item == ')') {
                counter++;
            }
            if (item == '(') {
                if (counter > 0) {
                    counter--;
                } else {
                    continue;
                }
            }
            sb.append(item);
        }


        return sb.reverse().toString();
    }


}
