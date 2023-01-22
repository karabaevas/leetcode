package medium.findtheindexofthefirstoccurrenceinastring;

class Solution {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length()-needle.length()+1; i++) {
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i+j) == needle.charAt(j)){
                    if (j == needle.length()-1){
                        return i;
                    }
                } else {
                    break;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().strStr("sad", "sad"));
    }
}