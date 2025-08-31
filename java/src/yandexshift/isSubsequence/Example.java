package yandexshift.isSubsequence;

public class Example {
    public static void main(String[] args) {
        Example main = new Example();
        System.out.println(main.isSubsequence("", "adv"));
    }

    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()){
            return true;
        }
        if (s.equals(t)){
            return  true;
        }

        int sIndex = 0;
        int tIndex = 0;

        while(sIndex < s.length() && tIndex < t.length()){
            if (s.charAt(sIndex) == t.charAt(tIndex)){
                sIndex++;
                tIndex++;

                if (sIndex == s.length()){
                    return true;
                }
            } else {
                tIndex ++;
            }
        }

        return false;
    }
}
