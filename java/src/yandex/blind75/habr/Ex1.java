package yandex.blind75.habr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex1 {
    public static void main(String[] args) {
        Ex1 main = new Ex1();
    }

//    https://leetcode.com/problems/intersection-of-two-arrays-ii/
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums1.length; i++){
            map.put(nums1[i], map.getOrDefault(nums1[i], 0)+1);
        }

        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums2.length; i++){
            Integer counter = map.get(nums2[i]);
            if(counter != null && counter>0){
                res.add(nums2[i]);
                map.put(nums2[i], counter-1);
            }
        }

        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
