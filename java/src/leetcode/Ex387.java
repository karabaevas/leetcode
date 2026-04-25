package leetcode;

public class Ex387 {
    public static void main(String[] args) {
        Ex387 main = new Ex387();



    }

    public int firstUniqChar(String s) {
        int[] arr = new int[26];
        for(char ch : s.toCharArray()){
            arr[ch-'a']++;
        }
        for(int i = 0; i< s.length(); i++){
            if(arr[s.charAt(i)-'a'] == 1){
                return i;
            }
        }

        return -1;
    }


}
