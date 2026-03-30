package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Ex821 {
    public static void main(String[] args) {
        Ex821 main = new Ex821();
    }
//    https://leetcode.com/problems/shortest-distance-to-a-character
        public int[] shortestToChar(String s, char c) {
            List<Integer> storage = new ArrayList<>();
            for(int i = 0; i< s.length(); i++){
                char ch = s.charAt(i);
                if(ch == c){
                    storage.add(i);
                }
            }

            int[] res = new int[s.length()];
            for(int i = 0; i< s.length(); i++){
                int diff = Integer.MAX_VALUE;
                for(int j = 0; j< storage.size(); j++){
                    diff = Math.min(diff, Math.abs(i-storage.get(j)));
                }

                res[i] = diff;
            }

            return res;
        }
}
