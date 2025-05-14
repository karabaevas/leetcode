package medium.LongestConsecutiveSequence;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().longestConsecutive(new int[]{10, 5, 1, 3, 4}));
    }

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0){
            return 0;
        }

        final Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int maxLength = 1;

        for (int num : nums) {
            int cur = num;
            int curLength = 1;
            if (set.contains(cur) && !set.contains(cur-1)){
                while(true){
                    if (set.contains(++cur)){
                        curLength++;
                        set.remove(cur);
                    } else {
                        maxLength = Math.max(maxLength, curLength);
                        break;
                    }
                }
            }
        }
        return maxLength;
    }
}
