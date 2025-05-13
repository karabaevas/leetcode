package medium.SumofTwoIntegers;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Main().getSum(-1,3));
    }


    public int getSum(int a, int b) {
        int sum = a ^ b;
        int shift =  (a & b) << 1;

        while (shift != 0){
            int newSum = sum ^ shift;
            int newShift = (sum & shift) << 1;

            sum = newSum;
            shift = newShift;
        }

        return sum;
    }


}
