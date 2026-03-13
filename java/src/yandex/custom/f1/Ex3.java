package yandex.custom.f1;

import java.util.HashMap;
import java.util.Map;

public class Ex3 {
    public static void main(String[] args) {
        Ex3 main = new Ex3();

        int[] result = main.twoSum(new int[]{2, 7, 11, 15}, 17);
        System.out.println(result);

    }


    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> storage = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer valInStorage = storage.get(nums[i]);
            if (valInStorage != null){
                return new int[]{i, valInStorage};
            }

            storage.put(target-nums[i], i);
        }



        return new int[]{};
    }


}
