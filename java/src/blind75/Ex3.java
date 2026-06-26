package blind75;

import java.util.HashMap;
import java.util.Map;

public class Ex3 {

    static void main() {
        new Ex3().lengthOfLongestSubstring("zxyzxyz");
    }

    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        Map<Character, Integer> map = new HashMap<>();
        int res = 0;

        while(r < s.length()){
            if(r - l == map.size()){
                map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) +1);
            }

            while(map.getOrDefault(s.charAt(r), 0) > 1){
                int freq = map.get(s.charAt(l))-1;
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
