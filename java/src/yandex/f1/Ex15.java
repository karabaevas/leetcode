package yandex.f1;

public class Ex15 {
    public static void main(String[] args) {
        Ex15 main = new Ex15();

        System.out.println(
//                main.isPalindrome("a1b2c3b2:a1")
//                main.isPalindrome("A man, a plan, a canal: Panama")
                main.isPalindrome("1P")
//                main.isPalindrome("")
        );
        ;
    }

    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char codePoint = s.charAt(i);
            if (Character.isAlphabetic(codePoint) || Character.isDigit(codePoint)) {
                sb.append(codePoint);
            }
        }
        s = sb.toString().toUpperCase();

        if (s.length() <= 1) {
            return true;
        }
        int left = 0;
        int right = s.length() - 1;

        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
