package medium.mergeinterval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println();

        main.merge(new int[][]{
//                new int[]{1, 3},
//                new int[]{2, 6},
//                new int[]{2, 7},
//                new int[]{8, 10},
//                new int[]{15, 18},
//                new int[]{15, 19}

                new int[] {1,4},
                new int[] {2,3}
        });
    }

//    [][][] [][] [][][][]
//    1 - 2
//    1 - 3
//    1 - 4


    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        Arrays.sort(intervals, Comparator.comparing(ar -> ar[0]));

        List<int[]> result = new ArrayList<>();
        int nextIndex = 1;

//        [0, 1] [2,3] [3,4]
        int[] newInterval = new int[]{intervals[0][0], intervals[0][1]};
        result.add(newInterval);
        while (nextIndex < intervals.length) { //!
            if (newInterval[1] >= intervals[nextIndex][0]) {
                newInterval[1] = Math.max(intervals[nextIndex][1], newInterval[1]);
                nextIndex++;
            } else {
                newInterval = new int[]{intervals[nextIndex][0], intervals[nextIndex][1]};
                nextIndex++;
                result.add(newInterval);
            }
        }


        return result.toArray(new int[0][]);
    }
}
