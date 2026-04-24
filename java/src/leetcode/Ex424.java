package leetcode;

public class Ex424 {
    public static void main(String[] args) {
        Ex424 main = new Ex424();



    }

    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int left = 0;
        int right = 0;
        int maxFreq = 0;
        int res = 0;
        while(right < s.length()){
            int freq = ++arr[s.charAt(right)-'A'];
            maxFreq = Math.max(maxFreq, freq);

            if(maxFreq + k < right-left+1 ){
                freq = --arr[s.charAt(left)-'A'];
                left++;
            }

            res = Math.max(res, right-left+1);

            right++;
        }

        return res;
    }


}
