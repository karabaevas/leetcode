package blind75;

public class Ex371 {
    public int getSum(int a, int b) {
        int res = 0;
        while(b != 0){
            res = a ^ b;
            int carry = (a & b) << 1;
            a = res;
            b = carry;
        }

        return a;
    }
}
