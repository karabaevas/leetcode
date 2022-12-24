package easy.PalindromeNumber;

class SolutionWithoutCheat {
    public boolean isPalindrome(int x) {
        int temp = 0, rev = 0;
        int original = x;

        while (x > 0) {
            temp = x % 10;
            rev = rev * 10 + temp;
            x = x / 10;
        }
        return rev == original;
    }

    public static void main(String[] args) {
        System.out.println(new SolutionWithoutCheat().isPalindrome(123));
    }
}