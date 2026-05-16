package leetcode;

import java.util.*;

/*
Написать структуру данных, хранящую целые числа и поддерживающую следующие операции:
1) добавление значения в множество
2) проверка есть ли значение в множестве
3) удаление значения из множества
4) получение случайного значения из множества.
*/
public class RandomSet {

    Map<Integer, Integer> map = new HashMap<>();
    List<Integer> list = new ArrayList<>();
    Random rand = new Random();

    public void add(int val) {
        list.add(val);
        map.put(val, list.size() - 1);
    }

    public boolean contains(int val) {
        return map.containsKey(val);
    }

    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }

    public void remove(int key) {
        Integer idx = map.get(key);
        if(idx == null){
            return;
        }
// list       0 1 2
// map    0 - 0, 1 - 1, 2 - 2

        int lastIdx = list.size() - 1;
        Integer lastVal = list.get(lastIdx);

        list.set(idx , lastVal);
        map.remove(key);
        list.remove(lastIdx);

        if(idx != lastIdx){
            map.put(lastVal, idx);
        }

    }
}
