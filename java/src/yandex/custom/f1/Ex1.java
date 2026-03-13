package yandex.custom.f1;

import java.util.HashSet;

public class Ex1 {
    public static void main(String[] args) {
        Ex1 ex1 = new Ex1();
//        ex1.containsDuplicate(new int[]{1,2,3,4});
//        ex1.containsDuplicate(new int[]{1,1});
//        ex1.containsDuplicate(new int[]{2,2});
//        ex1.containsDuplicate(new int[]{3,3});
        System.out.println(
                ex1.containsDuplicate(new int[]{3,1, 3})


        );
//        ex1.containsDuplicate(new int[]{1,2,2,0});

    }

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) return true;
            seen.add(num);
        }

        return false;
    }
}