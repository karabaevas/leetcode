package easy.ReversBits;

public class Main {

    public static void main(String[] args) {
        int input = Integer.MIN_VALUE;

        System.out.println(intToBinary(input));
        System.out.println(intToBinary(new Main().reverseBits(input)));
    }

    public int reverseBits(int x) {
        int b = 0;
        while (x!=0){
            b<<=1;
            b|=( x &1);
            x>>=1;
        }

        return b;
    }

    public static String intToBinary(int n)
    {
        String s = "";
        while (n > 0)
        {
            s =  ( (n % 2 ) == 0 ? "0" : "1") +s;
            n = n / 2;
        }
        return s;
    }

}
