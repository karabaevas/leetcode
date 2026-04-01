package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ex2215 {
    public static void main(String[] args) {
//        try {
        throw new RuntimeException("");
//        } catch (Exception ex){
//            System.out.println("");
//        }


    }

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        return List.of(doDiff(nums1, nums2), doDiff(nums2, nums1));
    }

    List<Integer> doDiff(int[] nums1, int[] nums2) {
        int i1 = 0;
        int i2 = 0;
        List<Integer> res = new ArrayList<>();

        while (i1 < nums1.length && i2 < nums2.length) {
            if (nums1[i1] < nums2[i2]) {
                int cur = nums1[i1];
                while (i1 < nums1.length && nums1[i1] == cur) {
                    i1++;
                }
                res.add(cur);
            } else {
                if (nums1[i1] > nums2[i2]) {
                    i2++;
                } else {
                    int cur = nums1[i1];
                    while (i1 < nums1.length && nums1[i1] == cur) {
                        i1++;
                    }
                    while (i2 < nums2.length && nums2[i2] == cur) {
                        i2++;
                    }
                }
            }
        }

        while (i1 < nums1.length) {
            int cur = nums1[i1];
            while (i1 < nums1.length && nums1[i1] == cur) {
                i1++;
            }
            res.add(cur);
        }
        return res;
    }
}