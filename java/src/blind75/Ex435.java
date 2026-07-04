package blind75;

import java.util.Arrays;
import java.util.Comparator;

public class Ex435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(el -> el[0]));

        int prevEnd = Integer.MIN_VALUE;
        int res = 0;
        for (int[] cur : intervals) {
            if (cur[0] >= prevEnd) {
                prevEnd = cur[1];
            } else {
                // intersection
                res++;
                prevEnd = Math.min(prevEnd, cur[1]);
            }
        }

        return res;
    }
}
