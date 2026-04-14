package leetcode;

public class Ex5 {
    public static void main(String[] args) {
        Ex5 main = new Ex5();



    }

    public String longestPalindrome(String s) {
        String  res = new String(s.substring(0,1));
        for(int i=0; i< s.length(); i++){
            String same = check(i,i, s);
            String next = check(i,i+1, s);
            if(same.length() > res.length()){
                res = same;
            }
            if(next.length() > res.length()){
                res = next;
            }
        }

        return res;
    }

    public String check(int left, int right, String s){
        String res = "";
        if(left<0 || right == s.length()){
            return res;
        }

        while(left >= 0 && right < s.length()){
            if(s.charAt(left) != s.charAt(right)){
                break;
            }
            res = s.substring(left, right+1);
            left--;
            right++;
        }

        return res;
    }

}
