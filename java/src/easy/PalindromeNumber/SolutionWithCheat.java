package easy.PalindromeNumber;

class SolutionWithCheat {
    public boolean isPalindrome(int x) {
        String original = String.valueOf(x);
        String reverse = new StringBuilder(original).reverse().toString();
        return original.equals(reverse);
    }


    public static void main(String[] args) {
        boolean result = new SolutionWithCheat().isPalindrome(9);
        System.out.println(result);
    }
}