package leetcode;

public class Ex557 {
    public static void main(String[] args) {
        Ex557 main = new Ex557();



    }

    public String reverseWords(String s) {
        int r = 0;
        int l = 0;

        StringBuilder sb = new StringBuilder();
        while(r < s.length() && l < s.length()){
            if(s.charAt(l) == ' '){
                sb.append(' ');
                l++;
                continue;
            }
            r = l;

            while(r+1 < s.length() && s.charAt(r+1) != ' '){
                r++;
            }

            int first = l;
            while(r >= first){
                sb.append(s.charAt(r));
                l++;
                r--;
            }


        }

        return sb.toString();
    }


}
