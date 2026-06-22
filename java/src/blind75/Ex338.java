package blind75;

public class Ex338 {
    public int[] countBits(int n) {
        int[] ar = new int[n+1];

        for(int i = 0; i <= n; i++){
            int bits = 0;
            int cur = i;
            while(cur != 0){
                int bit =  cur & 1;
                if(bit == 1){
                    bits++;
                }
                cur = cur >> 1;
            }
            ar[i] = bits;
        }
        return ar;
    }
}
