package easy.Happy.Number;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(new Main().isHappy(2));
    }

    //    19
    public boolean isHappy(int n) {
        Map<Integer, Object> prevResults = new HashMap<>();
        int result = 0;

        while (n != 1){ //19  82, 68
            if (prevResults.get(n) != null){
                return false;
            } else {
                prevResults.put(n, new Object()); // [19, 82, ]
            }

            while (n > 0) {
                int lastNumber = n % 10; //2 //8
                result = result + lastNumber * lastNumber; // 4 68
                n = n / 10; //8
            }

            n = result; //82
            result = 0;
        }
        return true;
    }
//    2
//    4
//    16
//37
//    49 9 = 58
//    25 64 = 89
//  81 + 64 = 145
//    1 + 16 + 25 = 42
//    16 + 4 = 20
//    4


}
