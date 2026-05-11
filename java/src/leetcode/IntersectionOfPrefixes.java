package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfPrefixes {
    public static void main(String[] args) {
        IntersectionOfPrefixes main = new IntersectionOfPrefixes();



    }
//    Для двух массивов целых чисел длины N, для всех K от 1 до N, посчитать количество общих чисел на префиксах длины K.
//    Числа в пределах массива могут повторяться, пересечение считается без учета кратности.
//
//    Пример:
//
//    Массив 1: 1 1 5 7
//    Массив 2: 5 1 7 1
//    Ответ:    0 1 2 3
//

    public List<Integer> filterSortedList(int[] first, int[] second) {
        List<Integer> resAr = new ArrayList<>();
        int res = 0;


        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < first.length; i++) {
            int cur = first[i];
            if(!set1.contains(cur) && set2.contains(cur)){
                res++;
            }
            set1.add(cur);

            cur = second[i];
            if(!set2.contains(cur) && set1.contains(cur)){
                res++;
            }
            set2.add(cur);

            resAr.add(res);
        }

        return resAr;
    }


}
