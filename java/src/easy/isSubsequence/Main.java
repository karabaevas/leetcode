package easy.isSubsequence;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.isSubsequence("abcc", "ahbgdc"));
    }

    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()){
            return true;
        }
        if (t.isEmpty()){
            return false;
        }
        if (s.equals(t)) {
            return true;
        }


        int sIndex = 0;
        int tIndex = 0;


        while (tIndex < t.length() && sIndex < s.length()) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                if (sIndex == s.length() - 1) {
                    return true;
                }
                sIndex++;
                tIndex++;
            } else {
                tIndex++;
            }
        }


        return false;
    }
}
