package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Ex658 {
    public static void main(String[] args) {
        Ex658 main = new Ex658();



    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0;
        int right = arr.length-1;

        while(right - left +1 > k){
            int rres = arr[right] -x;
            int lres = x - arr[left];
            int diff = rres - lres;
            if(diff == 0 || lres < rres) {
                right--;
            } else {
                left++;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = left; i<= right; i++){
            list.add(arr[i]);
        }

        return list;
    }


}
