package medium.partitionlabels;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
//        System.out.println(main.partitionLabels("ababcbacadefegdehijhklij"));
        System.out.println(main.partitionLabels("eaaaabaaec"));
    }

    public List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();

        if (s.length() == 0) {
            result.add(0);
            return result;
        }

        if (s.length() == 1) {
            result.add(1);
            return result;
        }

        Map<Character, Integer> last = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            last.put(character, i);
        }


        int startIndex = 0;
        int curIndex = 0;
        int endIndex = 0;

        while (curIndex < s.length()) {
            startIndex = curIndex;
            endIndex = last.get(s.charAt(curIndex));

            while (curIndex <= endIndex) {
                endIndex = Math.max(last.get(s.charAt(curIndex)), endIndex);
                curIndex++;
            }
            result.add(endIndex - startIndex + 1);
        }
        return result;
    }
}
