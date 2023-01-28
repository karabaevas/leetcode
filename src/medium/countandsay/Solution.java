package medium.countandsay;

class Solution {
    public String countAndSay(int n) {
        String result = "1";
        int counter = 1;
        if (n == 1) return result;

        while (counter < n) {
            String temp = "";

            int charCounter = 0;
            Character ch = null;
            for (int i = 0; i < result.length(); i++) {
                if (ch == null){
                    ch = result.charAt(i);
                    charCounter++;
                    if (i==result.length()-1){
                        temp = temp + charCounter + ch;
                    }
                    continue;
                }
                if (ch == result.charAt(i)){
                    charCounter++;
                    if (i==result.length()-1){
                        temp = temp + charCounter + ch;
                    }
                    continue;
                }
                if (ch != result.charAt(i)){
                    temp = temp + charCounter + ch;
                    charCounter = 1;
                    ch = result.charAt(i);
                    if (i==result.length()-1){
                        temp = temp + charCounter + ch;
                    }
                }
            }

            result = temp;
            counter++;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().countAndSay(5));
    }
}
