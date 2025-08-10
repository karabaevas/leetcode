package easy.reverse.string;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        char[] abcdes = new String("ab").toCharArray();
        new Main().reverseString(abcdes);
        System.out.println(new String(abcdes));

    }

//    abcde
//    abc
//    ab
    public void reverseString(char[] s) {
        if (s.length == 0 || s.length == 1)
            return;

        for(int i = 0; i < s.length/2; i++) {
            char tmp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = tmp;
        }
    }


}
