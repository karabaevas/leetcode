package yandex.last6month;

import java.util.HashSet;
import java.util.Set;

public class Ex8 {
    public static void main(String[] args) {
        Ex8 main = new Ex8();



    }
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Set<Integer> storage = new HashSet<>();

        int current = 0;
        int[] result = new int[A.length];
        for(int i = 0; i<A.length; i++){
            if(storage.contains(A[i])) {
                current++;
            } else {
                storage.add(A[i]);
            }

            if(storage.contains(B[i])) {
                current++;
            } else {
                storage.add(B[i]);
            }
            result[i] = current;
        }

        return result;
    }


}
