package easy.ValidAnagram;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                new Main().isAnagram("tasss", "sssat")
        );

        System.out.println(
                new Main().isAnagram("tasss", "msssat")
        );
    }

    public boolean isAnagram(String s, String t) {
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();

        Arrays.sort(sarr);
        Arrays.sort(tarr);

        return Arrays.equals(sarr, tarr);
    }
}
