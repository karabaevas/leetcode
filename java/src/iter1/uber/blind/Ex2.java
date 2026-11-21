package iter1.uber.blind;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

//https://leetcode.com/problems/top-k-frequent-elements/
public class Ex2 {

        record Dto(Integer freq, Integer num){};

        public int[] topKFrequent(int[] nums, int k) {
            Map<Integer, Integer> numTofreq = new HashMap<>();
            for(int i = 0; i<nums.length; i++){
                numTofreq.put(
                        nums[i],
                        numTofreq.getOrDefault(nums[i], 0)+1
                );
            }

            List<Dto> dtos = new ArrayList<>();
            for(Map.Entry<Integer, Integer> entry : numTofreq.entrySet()){
                dtos.add(new Dto(entry.getValue(), entry.getKey()));
            }

            PriorityQueue<Dto> pq = new PriorityQueue(k, Comparator.comparingInt(Dto::freq));

            for(int i=0; i<dtos.size(); i++){
                Dto cur = dtos.get(i);

                if(pq.size() < k){
                    pq.add(cur);
                } else {
                    if(pq.peek().freq() < cur.freq()){
                        pq.poll();
                        pq.add(cur);
                    }
                }
            }

            int res[] = new int[pq.size()];
            int i=0;
            while(!pq.isEmpty()){
                res[i] = pq.poll().num();
                i++;
            }

            return res;
        }
}
