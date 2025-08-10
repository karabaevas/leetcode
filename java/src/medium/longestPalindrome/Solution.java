package medium.longestPalindrome;

class Solution {
    public String longestPalindrome(String s) {
        if (s.length() == 1 || s.length() == 0)
            return s;
        for (int length = s.length()-1; length > 0; length--) {
            for (int i = 0; i+length < s.length(); i++) {
                int leftIndex=0;
                int rightIndex=length;
                String substring = s.substring(i, i+length+1);

                while (leftIndex <= rightIndex){
                    if (substring.charAt(leftIndex) != substring.charAt(rightIndex)){
                        break;
                    }

                    leftIndex++;
                    rightIndex--;
                }
                if (leftIndex > rightIndex){
                    return substring;
                }

            }
        }

        return s.substring(0, 1);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().longestPalindrome("ac"));
    }
}