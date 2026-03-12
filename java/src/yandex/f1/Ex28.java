package yandex.f1;

import java.util.*;

public class Ex28 {
    public static void main(String[] args) {
        Ex28 main = new Ex28();

        System.out.println(11%2);
    }

    public boolean isValid(String s) {
        if(s.length() % 2 != 0){
            return false;
        }

        LinkedList<Character> list = new LinkedList<>();

        for(int i =0; i< s.length(); i++){
            Character ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                list.addLast(ch);
            }
            else {
                Character last = list.pollLast();
                if(last == null){
                    return false;
                }
                if(
                        (ch == ')' && last != '(')
                                ||
                                (ch == '}' && last != '{')
                                ||
                                (ch == ']' && last != '[')
                ){
                    return false;
                }
            }
        }

        return list.isEmpty();
    }

}
