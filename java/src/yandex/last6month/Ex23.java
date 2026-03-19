package yandex.last6month;

public class Ex23 {
    public static void main(String[] args) {
        Ex23 main = new Ex23();
    }

    public boolean validPalindrome(String s) {
        int counter = 0;
        return isPali(s, 0);
    }

    private boolean isPali(String s, int counter){
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                if(counter==1){
                    return false;
                }
                counter++;
                return isPali(s.substring(left+1, right+1), counter) || isPali(s.substring(left, right), counter);
            }

            left++;
            right--;
        }
        return true;
    }


}
