package easy.Numberof1Bits;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                new Main().hammingWeight(2)
        );
    }

    public int hammingWeight(int n) {
        int counter = 0;

        while (n!=0){
            int bit = n & 1;
            if (bit == 1){
                counter++;
            }
            n = n >>1;
        }

        return counter;
    }
}
