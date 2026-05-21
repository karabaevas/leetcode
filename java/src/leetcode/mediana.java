package leetcode;

public class mediana {
    public static void main(String[] args) {
        mediana main = new mediana();



    }
    public int mediana(int x1, int x2, int x3) {
        if(x1 < x2){
            if(x2 < x3){
                return x2;
            }
            if(x1 < x3){
                return x3;
            } else {
                return x1;
            }
        }
        else {
            if(x2 > x3){
                return x2;
            }
            if(x1 > x3){
               return x3;
            } else {
                return x1;
            }
        }


    }


}
