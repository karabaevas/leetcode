package medium.lettercombinationsofaphonenumber;

import java.util.*;

class Solution {
    Map<Character, String> map = Map.of('2', "abc",
            '3', "def",
            '4', "ghi",
            '5', "jkl",
            '6', "mno",
            '7', "pqrs",
            '8', "tuv",
            '9', "wxyz");

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0){
            return List.of();
        }
        List<String> oldStrings = new ArrayList<>();
        String initialValue = "";
        oldStrings.add(initialValue);

        for (int i = 0; i < digits.length(); i++) {
            List<String> newStrings = new ArrayList<>();

            for (String letter : map.get(digits.charAt(i)).split("")) {
                for (String oldString : oldStrings) {
                    String newString = oldString + letter;
                    newStrings.add(newString);
                }
            }
            oldStrings = newStrings;
        }

        return oldStrings;
    }


    public static void main(String[] args) {
        System.out.println(new Solution().letterCombinations(""));
    }
}