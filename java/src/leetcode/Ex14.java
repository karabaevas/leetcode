package leetcode;

public class Ex14 {
    public static void main(String[] args) {
        Ex14 main = new Ex14();



    }

    public String longestCommonPrefix(String[] strs) {
        int min = Integer.MAX_VALUE;
        for(String str : strs){
            min = Math.min(str.length(), min);
        }

        for(int i = 0; i< min; i++){
            char ch = strs[0].charAt(i);

            for(String str : strs){
                char ch1 = str.charAt(i);
                if(ch != ch1){
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0].substring(0, min);
    }

}
