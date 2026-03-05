package yandex.f1;

import java.util.HashMap;
import java.util.Map;

public class Ex9 {
    public static void main(String[] args) {
        Ex9 main = new Ex9();

//        System.out.println(main.checkSubarraySum(new int[]{23,2,4,6,7}, 6));
//        System.out.println(main.checkSubarraySum(new int[]{5,0,0,0}, 3));
//        System.out.println(main.checkSubarraySum(new int[]{0}, 1));
//        System.out.println(main.checkSubarraySum(new int[]{0,1,0,3,0,4,0,4,0}, 5));
        System.out.println(main.checkSubarraySum(new int[]{1,2,3}, 5));



    }

    public boolean checkSubarraySum(int[] nums, int k) {
        if (nums.length <2) return false;
        int[] ps = new int[nums.length];
        ps[0] = nums[0];
        for(int i=1; i < ps.length; i++){
            ps[i] = ps[i-1] + nums[i];
        }

        Map<Integer, Integer> storage = new HashMap<>();
        storage.put(ps[0]%k, 0);
        for(int i=1; i < ps.length; i++){
            int rest = ps[i]%k;
            Integer idx = storage.get(rest);

            if(rest==0){
                return true;
            }
            if(idx != null){
                if (i-idx>1){
                    return true;
                }
            }

            if (idx == null){
                storage.put(ps[i]%k, i);
            }
        }
        return false;
    }


}
