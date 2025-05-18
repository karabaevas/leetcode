package medium.PalindromicSubstrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().countSubstrings("aaa"));


    }

    public int countSubstrings(String s) {
        if (s == null) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }

        List<String> oneLetters = Arrays.asList(s.split(""));
        List<String> result = new ArrayList<>(oneLetters);

        for (int i = 0; i < s.length()-1; i++) {
            String twoletterString = s.substring(i, i + 2);
            if (twoletterString.charAt(0) == twoletterString.charAt(1)){
                result.add(twoletterString);
            }
        }

        for (int wordSize = 3; wordSize <= s.length(); wordSize++) {
            for (int i = 0; i <= s.length() - wordSize; i++) {
                String substring = s.substring(i, i + wordSize);
                String reversed = new StringBuilder(substring).reverse().toString();
                if (substring.equals(reversed)){
                    result.add(substring);
                }
            }
        }


        return result.size();
    }
}
