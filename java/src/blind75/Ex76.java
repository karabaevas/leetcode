package blind75;

import java.util.HashMap;
import java.util.Map;

public class Ex76 {

    static void main() {
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
    }

    static public String minWindow(String s, String t) {
        Map<Character, Integer> tmap = new HashMap<>();
        for(Character ch: t.toCharArray()){
            tmap.put(ch, tmap.getOrDefault(ch, 0)+1);
        }

        int filled = 0;
        int l = 0;
        int r = 0;

        Map<Character, Integer> smap = new HashMap<>();
        int res = Integer.MAX_VALUE;
        int lres = 0;
        int rres = 0;

        while(r < s.length()){
            int freq = smap.getOrDefault(s.charAt(r), 0)+1;
            smap.put(s.charAt(r), freq);
            if(tmap.get(s.charAt(r)) != null && tmap.get(s.charAt(r)) == freq){
                filled++;
            }

            while(tmap.size() == filled){
                if(res >= r-l+1){
                    res=r-l+1;
                    lres = l;
                    rres = r;
                }

                freq = smap.getOrDefault(s.charAt(l), 0);
                if(tmap.get(s.charAt(l)) != null && tmap.get(s.charAt(l)) == freq){
                    filled--;
                }
                freq--;
                if(freq == 0){
                    smap.remove(s.charAt(l));
                } else {
                    smap.put(s.charAt(l), freq);
                }
                l++;
            }

            r++;
        }

        return res != Integer.MAX_VALUE ?  s.substring(lres, rres+1) : "";
    }

}
