package yandex.f1;

import java.util.Arrays;

public class Ex25 {
    public static void main(String[] args) {
        Ex25 main = new Ex25();


    }

    public boolean checkInclusion(String s1, String s2) {
        int[] ar1 = new int[26];
        int[] ar2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            ar1[ch - 'a'] += 1;
        }

        int left = 0;
        int right = 0;
        while (right < s2.length()) {
            if ((right - left) == s1.length()) {
                ar2[s2.charAt(left) - 'a'] -= 1;
                ar2[s2.charAt(right) - 'a'] += 1;

                if (Arrays.equals(ar2, ar1)) {
                    return true;
                }

                right++;
                left++;
                continue;
            }

            if ((right - left) < s1.length()) {
                ar2[s2.charAt(right) - 'a'] += 1;
                if (Arrays.equals(ar2, ar1)) {
                    return true;
                }
                right++;
            }
        }

        return false;
    }


}
