package easy.backspace.string.compare;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.backspaceCompare("ab#c", "ad#c"));
    }

    public boolean backspaceCompare(String s, String t) {
        StringBuilder sbuilder = new StringBuilder();
        StringBuilder tbuilder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (letter == '#') {
                if (sbuilder.length() != 0) {
                    sbuilder.deleteCharAt(sbuilder.length() - 1);
                }
            } else {
                sbuilder.append(letter);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char letter = t.charAt(i);
            if (letter == '#') {
                if (tbuilder.length() != 0) {
                    tbuilder.deleteCharAt(tbuilder.length() - 1);
                }
            } else {
                tbuilder.append(letter);
            }
        }

        return sbuilder.toString().equals(tbuilder.toString());
    }
}
