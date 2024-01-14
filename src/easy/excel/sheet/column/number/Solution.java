package easy.excel.sheet.column.number;

class Solution {
    public int titleToNumber(String columnTitle) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int result = 0;

        int wordLength = columnTitle.length();
        for (char c : columnTitle.toCharArray()) {
                result = result + (int) Math.pow(alphabet.length(), wordLength-1) * (alphabet.indexOf(c)+1);
            wordLength--;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().titleToNumber("ZY"));
    }
}