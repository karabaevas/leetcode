package yandex;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Ex1 {
    public static void main(String[] args) {
        Ex1 main = new Ex1();

        int[] result = main.sortSqArray(new int[]{-5,-3,1, 2, 3, 5});

        System.out.println(Arrays.stream(result).boxed().map(String::valueOf).collect(Collectors.joining(" ")));


    }

    public int[] sortSqArray(int[] array) {
        int[] result =  new int[array.length];

        if (array.length == 0) {
            return array;
        }
        if (array.length == 1) {
            return new int[]{array[0] * array[0]};
        }

        int lIndex = 0;
        int rIndex = array.length - 1;
        int curResultIndex =  array.length-1;
        while(lIndex <= rIndex){
            int lval = Math.abs(array[lIndex]);
            int rval = Math.abs(array[rIndex]);

            if (lval > rval){
                result[curResultIndex] = lval * lval;
                lIndex++;
            }else {
                result[curResultIndex] = rval * rval;
                rIndex--;
            }

            curResultIndex--;
        }

        return result;
    }


}
