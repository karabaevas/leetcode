package yandex.last6month;

public class Ex24 {
    public static void main(String[] args) {
        Ex24 main = new Ex24();


    }

    public boolean isPalindrome(String s) {
        s = s.toUpperCase();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< s.length(); i++){
            char ch = s.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                sb.append(ch);
            }
        }
        String s1 = sb.toString();

        int l  = 0;
        int r = s1.length()-1;

        while(l<r){
            if(s1.charAt(l) != s1.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }


}
