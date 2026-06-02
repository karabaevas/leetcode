package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class Ex56 {
    public static void main(String[] args) {
        Ex56 main = new Ex56();



    }

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(el -> el[0]));

        LinkedList<int[]> list = new LinkedList<>();
        for(int[] cur : intervals){
            if(list.isEmpty()){
                list.add(cur);
                continue;
            }

            int[] prev = list.getLast();
            if(prev[1] >= cur[0]){
                list.removeLast();
                if(prev[1] > cur[1]){
                    list.add(new int[] {prev[0], prev[1]});
                } else {
                    list.add(new int[] {prev[0], cur[1]});
                }
            } else {
                list.add(cur);
            }
        }

        return list.toArray(new int[list.size()][]);
    }


}
