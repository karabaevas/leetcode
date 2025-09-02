package yandexshift.calculate;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Example {
    public static void main(String[] args) {
        Example main = new Example();
        System.out.println(main.calculate("2*2*2*2*2/3"));
    }


    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        s = s.trim();
        int index = 0;
        int num = 0;
        char sign = '+';

        while (index < s.length()) {
            char ch = s.charAt(index);
            if(Character.isDigit(ch)){
                num = num*10 + ch - '0';
            }
            if (!Character.isDigit(ch) && ' '!=ch || index == s.length()-1){
                if (sign == '+'){
                    stack.push(num);
                }
                if (sign == '-'){
                    stack.push(-num);
                }
                if (sign == '*') {
                    stack.push(stack.pop() * num);
                }
                if (sign == '/') {
                    stack.push(stack.pop() / num);
                }
                num = 0;
                sign = ch;
            }
            index++;
        }

        while (!stack.isEmpty()){
            num = num + stack.pop();
        }

        return num;

    }
}
