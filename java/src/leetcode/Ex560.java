package leetcode;

import java.awt.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Ex560 {
    public static void main(String[] args) {
        Ex560 main = new Ex560();
    }

    //[[1,1], [-1,1]]

    public boolean isReflected(int[][] points) {
        HashSet<String> set = new HashSet<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < points.length; i++) {
            int[] cur = points[i];
            int x = cur[0];
            int y = cur[1];

            min = Math.min(x, min);
            max = Math.max(x, max);
            set.add(x + " " + y);
        }

        int sum = (min + max);
        for (int i = 0; i < points.length; i++) {
            int[] cur = points[i];
            int x = cur[0];
            int y = cur[1];

            if (!set.contains(sum - x + " " + y)) {
                return false;
            }
        }
        return true;
    }
}
