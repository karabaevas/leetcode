package leetcode;

public class Ex849 {
    public int maxDistToClosest(int[] seats) {
        int res = 0;

        int i = 0;
        while(i < seats.length) {
            int start = i;

            while(i < seats.length && seats[i] == 0) {
                i++;
            }

            if (start == 0 || i == seats.length) {
                res = Math.max(i - start, res);
            } else {
                if((i-start) % 2 == 0){
                    res = Math.max((i-start)/2, res);
                } else {
                    res = Math.max((i-start+1)/2, res);
                }
            }

            i++;
        }

        return res;
    }
}
