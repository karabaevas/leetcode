package leetcode;

public class SimplestCalcculator {
    public static void main(String[] args) {
        SimplestCalcculator main = new SimplestCalcculator();

        System.out.println(main.m("2+3*4+5")); ;

    }

    //    1
//    102
//    1 + 1
//    3 * 4 + 2
//    Дана строка-выражение вида: "1+3*8+379*43". При этом:
    public int m(String str) {
        int res = 0;
        int cur = 0;
        int multiRes = 1;
        char lastSign = '+';

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                cur = cur * 10 + (ch - '0');
            }

            if (i == str.length()-1 ||  !Character.isDigit(ch)) {
                if (i == str.length()-1 || ch == '+') {
                    if(lastSign == '*'){
                        multiRes *= cur;
                        res += multiRes;
                        cur = 0;
                    }

                    res += cur;
                    cur = 0;
                    lastSign = '+';
                } else if (ch == '*') {
                    multiRes *= cur;
                    lastSign = '*';
                    cur = 0;
                }
            }
        }

        return  res;
    }
}
