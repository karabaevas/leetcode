package leetcode;

public class SimplestCalcculator {
    public static void main(String[] args) {
        SimplestCalcculator main = new SimplestCalcculator();



    }
//    1
//    102
//    1 + 1
//    3 * 4 * 5 + 2
//    Дана строка-выражение вида: "1+3*8+379*43". При этом:
    public int m(String str) {
        int res = 0;
        int curNum = 0;
        int multRes = 1;
        char lastSign = '+';

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                curNum = curNum * 10 + (ch-'0');
            }

            if(i == str.length()-1 || !Character.isDigit(ch)){
                if(i == str.length()-1 || ch == '+'){
                    if(lastSign == '*'){
                        multRes *= curNum;
                        curNum = 0;
                        res = res + multRes;
                        multRes = 1;
                    }

                    res = res + curNum;
                    curNum = 0;
                    lastSign = '+';
                } else {
                    multRes *= curNum;
                    curNum = 0;
                    lastSign = '*';
                }
            }
        }
        return res;
    }
}
