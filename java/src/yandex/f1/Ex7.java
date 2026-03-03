package yandex.f1;

import java.util.HashSet;
import java.util.Set;

public class Ex7 {
    public static void main(String[] args) {
        Ex7 main = new Ex7();

        main.longestConsecutive(new int[]{1, 2, 3, 5});

    }

    public int longestConsecutive(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int maxCombo = 1;

        for (int num : nums) {
            if (set.contains(num) && !set.contains(num - 1) && set.contains(num+maxCombo)) {
                int curCombo = 1;
                while (set.contains(++num)) {
                    curCombo++;
                }
                maxCombo = Math.max(curCombo, maxCombo);
            }
        }

        return maxCombo;
    }

}
