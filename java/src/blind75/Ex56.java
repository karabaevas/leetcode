package blind75;

import java.util.*;

public class Ex56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(el -> el[0]));

        List<int[]> res = new ArrayList<>();
        int i = 0;
        int j = 1;

        while(j <= intervals.length){
            int[] prev = intervals[i];
            if(j == intervals.length){
                res.add(prev);
                break;
            }

            int[] cur = intervals[j];
            if(prev[1] >= cur[0]){
                prev[0] = Math.min(prev[0], cur[0]);
                prev[1] = Math.max(prev[1], cur[1]);
                j++;
            } else {
                res.add(prev);
                i = j;
                j = j++;
            }

        }

        return res.toArray(new int[0][]);
    }
}
