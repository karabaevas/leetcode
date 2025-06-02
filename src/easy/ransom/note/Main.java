package easy.ransom.note;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.canConstruct("a", "b"));
        System.out.println(main.canConstruct("aa", "aab"));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ransomArr = new int[26];
        int[] magazineArr = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            char letter = magazine.charAt(i);
            magazineArr[letter -'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char letter = ransomNote.charAt(i);
            ransomArr[letter -'a']++;
        }

        for (int i = 0; i < ransomArr.length; i++) {

            if (ransomArr[i] > magazineArr[i]){
                return false;
            }
        }

        return true;
    }
}
