package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Ex560Idz {
    public static void main(String[] args) {
        Ex560Idz main = new Ex560Idz();
    }

    public int[] subarraySum(int[] nums, int k) {
        int[] ps = new int[nums.length + 1];
        ps[0] = 0;
        for (int i = 1; i < ps.length; i++) {
            ps[i] = ps[i - 1] + nums[i - 1];
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < ps.length; i++) {
            Integer idx = map.get(ps[i] - k);
            if (idx != null) {
                return new int[]{idx, i - 1};
            }
            map.put(ps[i], i);

        }

        return new int[]{-1, -1};
    }
}
