package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Ex76 {
    public static void main(String[] args) {
        Ex76 main = new Ex76();



    }

    class Solution {
        public String minWindow(String s, String t) {
            Map<Character, Integer> tmap =  new HashMap<>();
            Map<Character, Integer> smap =  new HashMap<>();

            int fit = 0;
            int resLeft = -1;
            int resRight = -1;


            int left = 0;

            for(int i = 0; i < t.length(); i++){
                tmap.put(t.charAt(i), tmap.getOrDefault(t.charAt(i), 0)+1);
            }


            for(int i = 0; i < s.length(); i++){
                if(tmap.containsKey(s.charAt(i))){
                    int scounter = smap.getOrDefault(s.charAt(i), 0)+1;
                    smap.put(s.charAt(i), scounter);

                    int tcounter = tmap.get(s.charAt(i));

                    if(tcounter == scounter){
                        fit++;
                    }

                    while(fit == tmap.size()){
                        if(resRight == -1 || i-left < resRight - resLeft){
                            resLeft = left;
                            resRight = i;
                        }

                        if(tmap.containsKey(s.charAt(left))){
                            scounter = smap.getOrDefault(s.charAt(left), 0);
                            tcounter = tmap.get(s.charAt(left));

                            if(scounter == tcounter){
                                fit--;
                            }
                            smap.put(s.charAt(left), scounter-1);
                        }



                        left++;
                    }
                }
            }

            return resLeft == -1? "" :  s.substring(resLeft, resRight+1);
        }
    }


}
