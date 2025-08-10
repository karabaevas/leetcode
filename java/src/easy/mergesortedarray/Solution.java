package easy.mergesortedarray;

import java.util.*;


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i = 0; i < nums2.length; i++) {
            while (j < nums1.length) {
                if (nums1[j] > nums2[i] || j >= (m + i)) {
                    for (int k = m + i-1; k >= j; k--) {
                        nums1[k + 1] = nums1[k];
                    }
                    nums1[j] = nums2[i];
                    j++;
                    break;
                }
                j++;
            }
        }
    }


    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {1,2,3};

        new Solution().merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
}