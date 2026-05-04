package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueElementsDataStructure {
    public static void main(String[] args) {
        UniqueElementsDataStructure main = new UniqueElementsDataStructure();



    }

    // count элементов
    private Map<Integer, Integer> countMap;
    private Set<Integer> set;

    public UniqueElementsDataStructure() {
        countMap = new HashMap<>();
        set = new HashSet<>();
    }

    public void add(int x) {
        int counter = countMap.getOrDefault(x, 0) + 1;
        countMap.put(x, counter);
        if(counter == 1){
            set.add(x);
        } else {
            set.remove(x);
        }
    }

    public void delete(int x) {
        int counter = countMap.getOrDefault(x, 0);
        if(counter > 0){
            counter--;
            if(counter == 1){
                set.add(x);
            }
            countMap.put(x, counter);

            if(counter == 0){
                countMap.remove(x);
                set.remove(x);
            }
        }

    }

    public int getUnique() {
        return set.iterator().next();
    }


}