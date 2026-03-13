package yandex.custom.f1;

import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        Ex2 main = new Ex2();

        boolean anagram = main.isAnagram("abc", "cba");
        System.out.println(anagram);
    }

    public boolean isAnagram(String s, String t) {
        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();

        Arrays.sort(sa);
        Arrays.sort(ta);

        return Arrays.equals(sa, ta);
    }


}
