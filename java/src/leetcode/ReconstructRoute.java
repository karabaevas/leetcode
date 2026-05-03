package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReconstructRoute {
    public static void main(String[] args) {
        ReconstructRoute main = new ReconstructRoute();



    }
/*
Дан набор пар городов:
- между каждой парой городов сотрудник совершил прямой перелёт;
- информация, в каком направлении был совершён перелёт, утеряна.
- также утерян порядок перелетов.

Известно, что все указанные перелёты относятся к одному путешествию.
Каждый следующий перелёт сотрудник начинал из того города, в котором закончил предыдущий.
Никакой город не был посещён сотрудником дважды.
Город начала путешествия также отличается от конечной точки.
Выведите города в порядке следования по маршруту.
Существует два возможных ответа, подойдёт любой.

Примеры:
[("Москва", "Белград")] -> ["Москва", "Белград"]
[("Москва", "Белград"), ("Москва", "Ереван")] -> ["Ереван", "Москва", "Белград"]
*/

    record Pair<K, V>(K key, V value) {}

    public List<String> findRoute(List<Pair<String, String>> input) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, List<String>> storage = new HashMap<>();

        for (Pair<String, String> el : input){
            List<String> list = storage.getOrDefault(el.key, new ArrayList<>());
            list.add(el.value);
            storage.put(el.key, list);

            list = storage.getOrDefault(el.value, new ArrayList<>());
            list.add(el.key);
            storage.put(el.value, list);

            int counter = map.getOrDefault(el.key, 0);
            counter++;
            map.put(el.key, counter);

            counter = map.getOrDefault(el.value, 0);
            counter++;
            map.put(el.value, counter);
        }

        String start = "";
        for(Map.Entry<String, Integer> el: map.entrySet()){
            if(el.getValue() == 1){
                start = el.getKey();
                break;
            }
        }

        List<String> res = new ArrayList<>();
        String next = "";
        while(!storage.isEmpty()){
            List<String> cities = storage.get(start);
            res.add(start);

            next = cities.get(0);
            storage.remove(start);

            cities = storage.get(next);
            cities.remove(start);
            if (cities.size() > 0){
                storage.put(next, cities);
            } else {
                storage.remove(next);
            }
        }
        res.add(next);
        return res;
    }


}
