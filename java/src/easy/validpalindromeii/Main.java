package easy.validpalindromeii;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.validPalindrome("abca"));
    }

    public boolean validPalindrome(String s) {
        return validPalindtomeInternal(s, 0);
    }

    private static boolean validPalindtomeInternal(String s, int fixCounterr) {
        int leftIndex = 0;
        int rightIndex = s.length()-1;
        int fixCounter = fixCounterr;

        while (leftIndex <= rightIndex) {
            if (s.charAt(leftIndex) != s.charAt(rightIndex)) {
                fixCounter++;
                if (fixCounter > 1){
                    return false;
                }

                boolean a = validPalindtomeInternal(s.substring(leftIndex, rightIndex), fixCounter);
                boolean b = validPalindtomeInternal(s.substring(leftIndex + 1, rightIndex + 1), fixCounter);
                return a || b;
            }
            leftIndex++;
            rightIndex--;
        }

        return true;
    }
}
