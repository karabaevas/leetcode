package leetcode;

public class Ex125 {
    public static void main(String[] args) {
        Ex125 main = new Ex125();


    }

    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;

        while (left < right) {
            char chl = s.charAt(left);
            if (!Character.isLetterOrDigit(chl)) {
                left++;
                continue;
            }

            char chr = s.charAt(right);
            if (!Character.isLetterOrDigit(chr)) {
                right--;
                continue;
            }

            char sl = Character.toLowerCase(chl);
            char sr = Character.toLowerCase(chr);
            if(sl != sr) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }


}
