package easy.addbinary;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.addBinary("100", "1"));
    }

    public String addBinary(String a, String b) {
        int cur = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder res = new StringBuilder();

        while (i >= 0 || j >= 0 || cur > 0) {
            int sum = cur;
            if (i >= 0) {
                sum = sum + (a.charAt(i) - '0');
                i--;
            }
            if (j >= 0) {
                sum = sum + (b.charAt(j) - '0');
                j--;
            }
            res.append(sum % 2);
            cur = sum / 2;
        }


        return res.reverse().toString();
    }
}
