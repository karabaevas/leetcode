package easy.excel.sheet.column.title;

class Solution {
    public String convertToTitle(int columnNumber) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        StringBuilder stringBuilder = new StringBuilder();

        while (columnNumber >= 1){
            int index = (columnNumber-1) % alphabet.length();
            stringBuilder.append(alphabet.charAt(index));

            columnNumber = (columnNumber - (index+1)) / alphabet.length();
        }

        return stringBuilder.reverse().toString();
    }

//    public static void main(String[] args) {
//        System.out.println(new Solution().convertToTitle(701));
//    }
}