package easy.firstBadVersion;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.firstBadVersion(10));
    }

    public int firstBadVersion(int n) {
        if (n == 1) {
            return 1;
        }

        int l = 1;
        int r = n;

        while (true) {
            int diff = r-l;
            if (diff ==0){
                return r;
            }
            if (diff==1){
                if (isBadVersion(l)){
                    return l;
                } else{
                    return r;
                }
            }

            long rlong = r;
            long llong = l;
            int middle = (int) ((rlong + llong)/2);
            boolean isBad = isBadVersion(middle);
            if (isBad) {
                l = l;
                r = middle;
            } else {
                l = middle;
                r = r;
            }
        }
    }

    boolean isBadVersion(int version) {
        return version >= 4;
    }

    ;
}
