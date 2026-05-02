package leetcode;

import java.util.*;

public class Ex532 {
    public static void main(String[] args) {
        Ex532 main = new Ex532();


    }

//    есть такая задача. Найти количество пар элементов массива разность которых по модулю равна k (k-diff pairs in array)
//    Дан массив целых чисел a_1, a_2, ..., a_n и неотрицательное число k. Найдите количество пар элементов массива (i, j), таких, что i < j и |a_i - a_j| = k (модуль разности равен k).
//
//    Примеры:
//
//    {-5, -5, 1, -3, 0, 3, 3}, k = 6 -> 3
//    {-2, 1, 3, 0, -10, 1}, k = 0 -> 1

    public int findPairs(int[] nums, int k) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        HashSet res = new HashSet();


        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];

            List<Integer> fromMap = map.getOrDefault(cur - k, new ArrayList<>());
            for (Integer idx: fromMap){
                res.add(nums[i] + "" + nums[idx]);
            }

            fromMap = map.getOrDefault(cur + k, new ArrayList<>());
            for (Integer idx: fromMap){
                res.add(nums[i] + "" + nums[idx]);
            }

            List<Integer> idxes = map.getOrDefault(cur, new ArrayList<>());
            idxes.add(i);
            map.put(cur, idxes);
        }

        return res.size();
    }

}
