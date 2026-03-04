package yandex.f1;

import java.util.HashMap;
import java.util.Map;

public class Ex8 {
    public static void main(String[] args) {
        Ex8 main = new Ex8();

        System.out.println(
//                main.subarraySum(new int[]{1, 2, 3}, 3)
                main.subarraySum(new int[]{1, -1, 0, 0}, 0)
        );
    }


    public int subarraySum(int[] nums, int k) {
        int[] ps = new int[nums.length + 1];
        ps[0] = 0;

        for (int i = 1; i <= nums.length; i++) {
            ps[i] = ps[i - 1] + nums[i-1];
        }

        Map<Integer, Integer> storage = new HashMap<>();
        int result = 0;

        for (int i = 0; i < ps.length; i++) {
            Integer prefixCounter = storage.get(ps[i] - k);
            if (prefixCounter != null) {
                result += prefixCounter;
            }

            Integer counter = storage.getOrDefault(ps[i], 0);
            storage.put(ps[i], counter + 1);

        }

        return result;
    }
}

