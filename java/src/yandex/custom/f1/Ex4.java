package yandex.custom.f1;

import java.util.*;

public class Ex4 {
    public static void main(String[] args) {
        Ex4 main = new Ex4();

        System.out.println(main.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);

            List<String> saved = result.get(sorted);
            if (saved == null) {
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                result.put(sorted, list);
            } else {
                saved.add(str);
            }
        }

        List<List<String>> values = new ArrayList<>(result.values());
        return values;
    }


}
