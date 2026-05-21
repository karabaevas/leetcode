package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Ex204 {
    public static void main(String[] args) {
        Ex204 main = new Ex204();



    }

    public int countPrimes(int n) {

        List<Integer> res = new ArrayList<>();

        for(int i = 2; i < n; i++){
            if(checkIsPrime(i)){
                res.add(i);
            }
        }

        return res.size();
    }

    boolean checkIsPrime(int num){
        if(num < 2){
            return false;
        }

        for(int i = 2; i <= (int) Math.sqrt(num); i++){
            if(num%i == 0){
                return false;
            }
        }

        return true;
    }


}
