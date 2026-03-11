package yandex.f1;

public class Ex23 {
    public static void main(String[] args) {
        Ex23 main = new Ex23();

//        main.characterReplacement("AABABBA", 1);


    }
    public int characterReplacement(String s, int k) {
        int[] ar = new int[26];
        int maxFreq = 1;
        int result = 0;

        int left = 0;
        int right = 0;
        while(right < s.length()){
            ar[s.charAt(right)-'A']++;
            maxFreq = Math.max(ar[s.charAt(right)-'A'], maxFreq);

            if((right-left+1)-maxFreq>k){
                ar[s.charAt(left)-'A']--;
                left++;
            }

            result = Math.max(result, right-left+1);
            right++;
        }

        return result;
    }

}
