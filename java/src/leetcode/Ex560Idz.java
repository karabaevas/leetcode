package leetcode;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Ex560Idz {
    public static void main(String[] args) {
        Ex560Idz main = new Ex560Idz();
    }

    public List subarraySumIdx(int[] nums, int k) {
        int[] ps = new int[nums.length];

        ps[0] = 0;
        for (int i = 1; i< ps.length; i++){
            ps[i] = ps[i-1]+nums[i-1];
        }

        Map<Integer, Integer> storage = new HashMap<>();
        for(int i = 0; i < ps.length; i++){
            Integer idx = storage.get(ps[i] - k);
            if(idx != null){
                return List.of(idx, i);
            }

            storage.put(ps[i], i);
        }

        return List.of(-1, -1);
    }
}
