package easy.pascalstriangle;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> first = List.of(1);
        List<Integer> second = List.of(1,1);
        if (numRows == 1) {
            return List.of(first);
        }
        if (numRows == 2) {
            return List.of(first, second);
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(first);
        result.add(second);

        int i = 2;
        while (i < numRows) {
            List<Integer> curLevel = result.get(i-1);
            List<Integer> nextLevel = new ArrayList<>();

            for (int j = 0; j <= curLevel.size(); j++) {
                if (j == 0 || j == curLevel.size()) {
                    nextLevel.add(1);
                } else {
                    nextLevel.add(curLevel.get(j) + curLevel.get(j - 1));
                }
            }
            result.add(nextLevel);
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().generate(5));
    }

}