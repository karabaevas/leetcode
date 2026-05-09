package leetcode;

public class Ex161 {
    public static void main(String[] args) {
        Ex161 main = new Ex161();



    }
//    OneEditApart("cat", "dog") -> false
//    OneEditApart("cat", "cats") -> true
//    OneEditApart("cat", "cut") -> true
//    OneEditApart("cat", "cast") -> true
//    OneEditApart("cat", "at") -> true
//    OneEditApart("cat", "acts") -> false
//283
    public boolean isAtMostOneEditApart(String s, String t) {
        if(s.length() < t.length()){
            return isAtMostOneEditApart(t, s);
        }

        int sidx = 0;
        int tidx = 0;
        int edits = 0;

        while(sidx < s.length() && tidx < t.length()){
            char sch = s.charAt(sidx);
            char tch = t.charAt(tidx);

            if(sch != tch) {
                if(s.length() > t.length()){
                    sidx++;
                }else {
                    sidx++;
                    tidx++;
                }
                edits++;
                continue;
            }

            sidx++;
            tidx++;
        }

        while(sidx < s.length()){
            sidx++;
            edits++;
        }

        return edits <= 1;
    }

}
