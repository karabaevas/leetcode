package yandexshift.summaryRanges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        Example main = new Example();
        System.out.println(main.summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));
        System.out.println(main.summaryRanges(new int[]{0,2,3,4,6,8,9}));
    }

    //    Input: nums = [0,1,2,4,5,7]
//    Input: nums = [5,6,7]
//    Output: ["0->2","4->5","7"]
//    Input: nums = [0,2,3,4,6,8,9]
    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) {
            return Collections.emptyList();
        }

        if (nums.length == 1) {
            return List.of(String.valueOf(nums[0]));
        }

        List<String> res = new ArrayList<>();
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                start = nums[i];
                end = nums[i];
                continue;
            }
            if (nums[i] - nums[i - 1] == 1) {
                end = nums[i];
                if (i == nums.length - 1) {
                    if (start == end) {
                        res.add(String.valueOf(start));
                    } else {
                        res.add(start + "->" + end);
                    }
                }
            } else {
                if (start == end) {
                    res.add(String.valueOf(start));
                } else {
                    res.add(start + "->" + end);
                }
                start = nums[i];
                end = nums[i];
                if (i == nums.length - 1) {
                    res.add(String.valueOf(start));
                }

            }

        }

        return res;
    }
}
