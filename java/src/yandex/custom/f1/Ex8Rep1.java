package yandex.custom.f1;

import java.util.HashMap;
import java.util.Map;

public class Ex8Rep1 {
    public static void main(String[] args) {
        Ex8Rep1 main = new Ex8Rep1();

        System.out.println(
                main.subarraySum(new int[]{1,2,3}, 3)
//                main.subarraySum(new int[]{1,-1,0}, 0)
        );
    }


    public int subarraySum(int[] nums, int k) {
        int[] ps = new int[nums.length+1];

        ps[0]=0;
        for(int i=1; i<ps.length; i++){
            ps[i]=ps[i-1]+nums[i-1];
        }

        Map<Integer, Integer> map = new HashMap<>();
        int result=0;
        for(int i=0; i<ps.length ; i++){
            Integer value = map.get(ps[i]-k);
            if(value != null){
                result+=value;

            }
            map.put(ps[i],map.getOrDefault(ps[i], 0)+1);
        }

        return result;
    }
}

//Ошибки:
//1 неправильно выставил размерность
//int[] ps = new int[nums.length+1]; почему-то решил использовать k в качестве размерности ps

//2 запутался в map.put(ps[i],map.getOrDefault(ps[i], 0)+1); изначально передаватл значение из value;
//скорее всего причиной проблемы стало то что опираюсь на предыдущее решение которое частично помню. что мешает на создании нового решения с нуля.



