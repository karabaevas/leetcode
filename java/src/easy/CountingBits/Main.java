package easy.CountingBits;

public class Main {


    public static void main(String[] args) {
        int[] x = new Main().countBits(5);
        System.out.println(
                x
        );
    }

    public int[] countBits(int n) {
        int[] result = new int[n+1];

        for (int i = 0; i <= n; i++) {
            int cur = i;

            int counter = 0;
            while (cur != 0){
                int bit = cur & 1;
                if (bit == 1){
                    counter++;
                }
                cur = cur >> 1;
            }

            result[i] = counter;
        }

        return result;
    }
}
