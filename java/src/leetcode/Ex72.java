package leetcode;

public class Ex72 {
    public static void main(String[] args) {
        Ex72 main = new Ex72();



    }

    public boolean isOneEditDistance(String s, String t){
        int sIdx = 0;
        int tIdx = 0;
        int changes = 0;

        if(Math.abs(s.length()-t.length()) >1){
            return false;
        }

        while(changes < 2 && sIdx < s.length() && tIdx < t.length()){
            if(s.charAt(sIdx) == t.charAt(tIdx)){
                sIdx++;
                tIdx++;
            } else {
                if(s.length() > t.length()){
                    sIdx++;
                } else {
                    if(t.length() > s.length()){
                        tIdx++;
                    } else {
                        sIdx++;
                        tIdx++;
                    }
                }
                changes++;
            }
        }

        while(sIdx < s.length()){
            changes++;
            sIdx++;
        }
        while(tIdx < t.length()){
            changes++;
            tIdx++;
        }

        return  changes == 1;
    }


}
