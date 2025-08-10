package medium.longestRepeatingCharacterReplacement;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

//        System.out.println(main.characterReplacement("AABABBA", 2));
//        System.out.println(main.characterReplacement("AABABBA", 2));
//        System.out.println(main.characterReplacement("ABAB", 2));
        System.out.println(main.characterReplacement("AAAA", 0));
//        System.out.println(main.characterReplacement("AAAB", 0));
//        System.out.println(main.characterReplacement("ABBB", 2));
    }

    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int res = 0;
        int max = 0;

        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            arr[s.charAt(r) - 'A']++;
            max = Math.max(max, arr[s.charAt(r) - 'A']);
            if (r - l + 1 > k + max) {
                arr[s.charAt(l) - 'A']--;
                l++;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
