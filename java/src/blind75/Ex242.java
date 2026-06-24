package blind75;

import java.util.Arrays;

public class Ex242 {
    public boolean isAnagram(String s, String t) {
        int[] sar = new int[26];
        int[] tar = new int[26];

        for(char ch: s.toCharArray()){
            sar[ch-'a'] = sar[ch-'a']+1;
        }

        for(char ch: t.toCharArray()){
            tar[ch-'a'] = tar[ch-'a']+1;
        }

        return Arrays.equals(sar, tar);
    }


}
