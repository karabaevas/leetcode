package blind75;

import java.util.HashMap;
import java.util.Map;

public class Ex424 {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0;
        int mf = 0;
        Map<Character, Integer> map = new HashMap<>();
        int res = 0;
        while(r < s.length()){
            int freq = map.getOrDefault(s.charAt(r), 0)+1;
            map.put(s.charAt(r), freq);
            mf = Math.max(freq, mf);

            while(r-l+1 > mf+k){
                freq = map.get(s.charAt(l))-1;
                if(freq == 0){
                    map.remove(s.charAt(l));
                } else {
                    map.put(s.charAt(l), freq);
                }
                l++;
            }

            res = Math.max(res, r-l+1);
            r++;
        }

        return res;
    }
}
