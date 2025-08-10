package easy.binarysearch;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.search(new int[]{1,2,3,4,5}, 3));
    }

    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        long rlong = r;
        long llong = l;

        while (true){
            long m = (rlong + llong)/2;

            int diff = (int) (rlong - llong);
            if (diff <= 1){
                if (nums[(int) rlong] == target){
                    return (int) rlong;
                }
                if (nums[(int) llong] == target)
                    return (int) llong;
                else
                    return -1;
            }

            if (nums[(int)m] > target){
                rlong = m;
                llong = llong;
            } else {
                rlong = rlong;
                llong = m;
            }
        }
    }
}
