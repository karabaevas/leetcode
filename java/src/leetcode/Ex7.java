package leetcode;

public class Ex7 {
    public int reverse(int x) {
        int res = 0;
        int rest = 0;

        while( x != 0){
            int resBefore = res;
            rest = x % 10;
            x = x/10;
            res = res * 10 + rest;
            if(res /10 != resBefore){
                return 0;
            }
        }

        return res;
    }


}
