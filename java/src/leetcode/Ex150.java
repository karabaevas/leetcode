package leetcode;

import java.util.LinkedList;

public class Ex150 {
    public static void main(String[] args) {
        Ex150 main = new Ex150();



    }


    public int evalRPN(String[] tokens) {
        LinkedList<Integer> list = new LinkedList();

        for(String cur: tokens){
            if(!cur.equals("+") && !cur.equals("-") && !cur.equals("*") && !cur.equals("/")){
                list.addLast(Integer.parseInt(cur));
            } else {
                int s = list.pollLast();
                int f = list.pollLast();
                int res = 0;

                if(cur.equals("+")){
                    res += f+s;
                }else if(cur.equals("-")){
                    res += f-s;
                }else if(cur.equals("*")){
                    res += f*s;
                }else {
                    res += f/s;
                }
                list.addLast(res);
            }
        }
        return list.getLast();
    }

}
