package yandex.last6month;

import java.util.*;

public class Ex32 {
    public static void main(String[] args) {}

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l = 0;
        int r = arr.length-1;
        while(l < r){
            int m = (r+l)/2;
            if(arr[m] >= x){
                r = m;
            } else {
                l = m+1;
            }
        }

        List<Integer> res = new ArrayList<>();
        r = l;
        l = l-1;

        while(res.size() < k){
            if(r >= arr.length){
                res.add(arr[l]);
                l--;
                continue;
            }
            if(l < 0){
                res.add(arr[r]);
                r++;
                continue;
            }
            if(Math.abs(arr[l] - x) <= Math.abs(arr[r] -x)){
                res.add(arr[l]);
                l--;
            } else {
                res.add(arr[r]);
                r++;
            }
        }

        Collections.sort(res);
        return res;
    }

}
