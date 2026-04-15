package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Ex986 {
    public static void main(String[] args) {
        Ex986 main = new Ex986();

    }

    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int idx1 = 0;
        int idx2 = 0;

        List<int[]> res = new ArrayList<>();
        while(idx1 < firstList.length && idx2 < secondList.length){
            int[] el1 = firstList[idx1];
            int[] el2 = secondList[idx2];

            if(el1[1] < el2[0]){
                idx1++;
                continue;
            }
            if(el2[1] < el1[0]){
                idx2++;
                continue;
            }


            int start = Math.max(el1[0], el2[0]);
            int end = Math.min(el1[1], el2[1]);

            res.add(new int[]{start, end});
            if(el1[1] == el2[1]){
                idx1++;
                idx2++;
                continue;
            }
            if(el1[1] < el2[1]){
                idx1++;
            } else {
                idx2++;
            }
        }

        return res.toArray(new int[res.size()][]);
    }


}
