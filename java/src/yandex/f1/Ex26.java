package yandex.f1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex26 {
    public static void main(String[] args) {
        Ex26 main = new Ex26();



    }

    public List<Integer> findAnagrams(String s, String p) {
        int[] arP = new int[26];
        int[] arS = new int[26];

        for(int i=0; i<p.length(); i++){
            arP[p.charAt(i)-'a']++;
        }

        List<Integer> result = new ArrayList<>();
        int left = 0;
        for(int right=0; right<s.length(); right++){
            if(right-left<p.length()){
                arS[s.charAt(right)-'a']++;
                if(Arrays.equals(arS, arP)){
                    result.add(left);
                }
            } else {
                arS[s.charAt(left)-'a']--;
                left++;
                arS[s.charAt(right)-'a']++;

                if(Arrays.equals(arS, arP)){
                    result.add(left);
                }
            }
        }
        return result;

    }


}
