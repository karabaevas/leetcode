package yandex.last6month;//package yandex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Ex28 {
    public static void main(String[] args) {
        Ex28 main = new Ex28();
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx2 = n-1;
        int idx1 = m-1;

        for(int i = nums1.length-1; i>=0; i--){
            if(idx1 >= 0 && (idx2 < 0 || nums2[idx2] < nums1[idx1])){
                nums1[i] = nums1[idx1];
                idx1--;
            } else {
                nums1[i] = nums2[idx2];
                idx2--;
            }
        }
    }


}
