package leetcode;

import java.util.HashSet;
import java.util.Set;

public class Ex2657 {
    public static void main(String[] args) {
        Ex2657 main = new Ex2657();



    }

    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Set<Integer> visited = new HashSet<>();

        int counter = 0;
        int[] res = new int[A.length];
        for(int i = 0; i < A.length; i++){
            int a = A[i];
            if(visited.contains(a)){
                counter++;
            } else {
                visited.add(a);
            }
            int b = B[i];
            if(visited.contains(b)){
                counter++;
            }  else {
                visited.add(b);
            }

            res[i] = counter;
        }

        return res;
    }

}
