package blind75;

public class Ex191 {
    public int hammingWeight(int n) {
        int res = 0;
        while(n != 0){
            int bit = n & 1;
            if(bit == 1){
                res++;
            }
            n = n >> 1;
        }
        return res;
    }
}
