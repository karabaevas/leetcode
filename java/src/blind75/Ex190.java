package blind75;

public class Ex190 {
    public int reverseBits(int n) {
        int res = 0;
        int idx = 0;
        while(idx < 32){
            int lastBit = n & 1;
            n = n >> 1;

            res = res << 1;
            res = res | lastBit;
            idx++;
        }

        return res;
    }

}
