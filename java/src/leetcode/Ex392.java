package leetcode;

public class Ex392 {
    public static void main(String[] args) {
        Ex392 main = new Ex392();



    }

    public boolean isSubsequence(String s, String t) {
        int sidx = 0;
        int tidx = 0;

        while(sidx < s.length() && tidx < t.length()) {
            if(s.charAt(sidx) != t.charAt(tidx)){
                tidx++;
            } else {
                sidx++;
                tidx++;
            }
        }

        if(sidx != s.length()){
            return false;
        }
        return true;
    }


}
