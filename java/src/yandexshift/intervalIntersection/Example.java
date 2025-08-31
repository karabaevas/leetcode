package yandexshift.intervalIntersection;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        Example main = new Example();
    }

    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int firstIndex = 0;
        int secondIndex = 0;

        int LEFT = 0;
        int RIGHT = 1;

        List<int[]> res = new ArrayList<>();

        while (firstIndex < firstList.length && secondIndex < secondList.length) {
            int[] firstInterval = firstList[firstIndex];
            int[] secondInterval = secondList[secondIndex];

            if (firstInterval[LEFT] > secondInterval[RIGHT]) {
                secondIndex++;
                continue;
            }
            if (firstInterval[RIGHT] < secondInterval[LEFT]) {
                firstIndex++;
                continue;
            }

            int maxLeft = Math.max(firstInterval[LEFT], secondInterval[LEFT]);
            int minRight = Math.min(firstInterval[RIGHT], secondInterval[RIGHT]);
            res.add(new int[]{maxLeft, minRight});

            if (minRight == firstInterval[RIGHT]) {
                firstIndex++;
            } else {
                secondIndex++;
            }
        }

        return res.toArray(new int[][]{});
    }
}
