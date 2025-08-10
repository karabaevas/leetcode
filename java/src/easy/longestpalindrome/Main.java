package easy.longestpalindrome;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));
//        System.out.println(main.longestPalindrome("bb"));
    }

    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0){
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }

        String[] strings = s.split("");
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            String key = strings[i];
            Integer value = map.get(key);
            if (value == null) {
                map.put(key, 1);
            } else {
                map.put(key, ++value);
            }
        }

        int result = 0;
        int maxOdd = 0;
        int oddSum = 0;
        int oddLetterCounter = 0;
        for (Integer value : map.values()) {
            if (value % 2 == 0) {
                result += value;
            } else {
                maxOdd = Math.max(maxOdd, value);
                if (value > 1){
                    oddSum += value;
                    ++oddLetterCounter;
                }
            }
        }

        if (maxOdd != 0){
            int odd = (oddSum) - (oddLetterCounter - 1);
            return result+odd;
        }
        return result;
    }
}
