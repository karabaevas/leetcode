package leetcode;

public class maximumProductSubarray {

    public static void main(String[] args) {
        maximumProductSubarray main = new maximumProductSubarray();



    }

//    Дана последовательность целых чисел. Необходимо найти минимально возможное произведение
//    пары элементов последовательности (пара - два каких-то элемента, не обязательно подряд идущие).
//    Например, для последовательности чисел 9 4 2 5 3 ответ будет 6.

//    ++++ - min1 * min2
//    ---- - max1 * max2
//    +++- - min1 * max1
//    ++-- - min1 * max1

//9 4 2 5 3
    public int m(int[] arr) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

//min1 = 2
//min2 = 4

//3
        for (int cur : arr) {
            if (cur < min1) {
                min2 = min1;
                min1 = cur;
            } else if(cur < min2){
                min2 = cur;
            }

            if (cur > max1) {
                max2 = max1;
                max1 = cur;
            } else if(cur > max2){
                max2 = cur;
            }
        }

        return Math.min(Math.min(min1* min2, max1*max2), min1*max1);
    }

//    ++++ - min1 * min2
//    ---- - max1 * max2
//    +++- - min1 * max1
//    ++-- - min1 * max1


}
