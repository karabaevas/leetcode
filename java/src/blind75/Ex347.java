package blind75;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ex347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(int num: nums){
            int freq = map.getOrDefault(num, 0)+1;
            map.put(num, freq);
            max = Math.max(max, freq);
        }

        Set<Integer>[] ar = new HashSet[max+1];
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            Set<Integer> set = ar[entry.getValue()];
            if(set == null){
                set = new HashSet<>();
            }
            set.add(entry.getKey());
            ar[entry.getValue()] = set;
        }

        int[] res = new int[k];
        int idx = 0;
        for(int i = ar.length-1; i>=0; i--){
            Set<Integer> set = ar[i];
            if(set == null || set.isEmpty()){
                continue;
            }

            for(int j: set){
                if(idx < res.length){
                    res[idx] = j;
                    idx++;
                } else {
                    return res;
                }
            }
        }

        return res;
    }

}
