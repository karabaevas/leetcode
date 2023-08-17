package easy.valid.palindrome;

import java.util.Arrays;
import java.util.List;

class Solution {
    public boolean isPalindrome(String s) {
        if (s == null){
            return false;
        }
        s = s.toLowerCase();

        char[] result = new char[s.length()];
        int j = 0;
        int garbage = 0;
        for (int i = 0; i < s.length(); i++) {
            char curChar = s.charAt(i);
            if (Character.isLetter(curChar) || Character.isDigit(curChar)){
                result[j] = curChar;
                j++;
            } else{
                garbage++;
            }
        }

        result = Arrays.copyOfRange(result, 0, result.length-garbage);


        int left = 0;
        int right = result.length-1;

        while (left <= right){
            if (result[left] != result[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(new Solution().isPalindrome("race a car"));
        System.out.println(new Solution().isPalindrome("r."));
        System.out.println(new Solution().isPalindrome("0a"));
    }
}