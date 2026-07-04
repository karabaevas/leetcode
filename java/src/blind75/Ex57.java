package blind75;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        int i = 0;
        List<int[]> res = new ArrayList<>();
        while(i<intervals.length && newInterval[0] > intervals[i][1]){
            res.add(intervals[i]);
            i++;
        }

        while(i<intervals.length && (intervals[i][0] <= newInterval[1] && intervals[i][1] >= newInterval[0])
        ){
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        res.add(newInterval);

        while(i<intervals.length){
            res.add(intervals[i]);
            i++;
        }

        return res.toArray(new int[0][]);
    }
}
