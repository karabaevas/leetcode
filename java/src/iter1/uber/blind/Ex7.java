package iter1.uber.blind;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex7 {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for(String str : strs){
            byte[] bar = str.getBytes();
            Arrays.sort(bar);

            String key = new String(bar);
            List<String> words = map.getOrDefault(key, new ArrayList<>());
            words.add(str);
            map.put(key, words);
        }

        List<List<String>> res = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            res.add(entry.getValue());
        }

        return res;
    }

}
