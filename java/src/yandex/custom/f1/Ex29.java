package yandex.custom.f1;

import java.util.HashMap;
import java.util.Map;

public class Ex29 {
    public static void main(String[] args) {
        Ex29 main = new Ex29();

        main.nextGreaterElement(new int[] { 4,1,2}, new int[]{1,3,4,2});

    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        Map<Integer, Integer> valIdx = new HashMap<>();
        for(int i = 0; i< nums2.length; i++){
            valIdx.put(nums2[i], i);
        }

        for(int i=0; i< nums1.length; i++){
            int val = nums1[i];
            int idx = valIdx.get(val);
            int nextIdx = idx+1;
            result[i] = -1;
            while(nextIdx<nums2.length){
                if(nums2[nextIdx] > val){
                    result[i] = nums2[nextIdx];
                    break;
                }
                nextIdx++;
            }
        }
        return result;
    }

}
