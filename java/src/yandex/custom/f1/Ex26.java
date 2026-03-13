package yandex.custom.f1;

public class Ex26 {
    public static void main(String[] args) {
        Ex26 main = new Ex26();

        main.minWindow("ADOBECODEBANC", "ABC");


    }

    public String minWindow(String s, String t) {
        int[] arS = new int[128];
        int[] arT = new int[128];

        for (int i = 0; i < t.length(); i++) {
            arT[t.charAt(i) - 'A']++;
        }

        String result = null;

        int left = 0;
        int right = 0;
        while (right < s.length()) {

            arS[s.charAt(right) - 'A']++;
            if (this.equals(arS, arT)) {
                String tmp = s.substring(left, right + 1);
                if (result == null || result.length() > tmp.length()) {
                    result = tmp;
                }

                while (this.equals(arS, arT)) {
                    tmp = s.substring(left, right + 1);
                    if (result == null || result.length() > tmp.length()) {
                        result = tmp;
                    }
                    arS[s.charAt(left) - 'A']--;
                    left++;
                }
            }

            right++;
        }

        if (result == null) {
            return "";
        }

        return result;
    }

    public boolean equals(int[] arS, int[] arT) {
        for (int i = 0; i < arS.length; i++) {
            int sVal = arS[i];
            int tVal = arT[i];

            if (tVal > 0 && sVal < tVal) {
                return false;
            }
        }
        return true;
    }
}
