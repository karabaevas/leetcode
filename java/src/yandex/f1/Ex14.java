package yandex.f1;

public class Ex14 {
    public static void main(String[] args) {
        Ex14 main = new Ex14();


        main.carPooling(new int[][]{
           new int[]{2,1,5},
           new int[]{3,3,7}
        }, 4);
    }

    public boolean carPooling(int[][] trips, int capacity) {
        int[] path = new int[1001];
        int max = 0;
        for(int i=0; i< trips.length; i++){
            int[] trip = trips[i];
            int from = trip[1];
            int to = trip[2];
            int cap = trip[0];
            path[from] = path[from]+cap;
            path[to] = path[to]-cap;
            max = Math.max(to, max);
        }

        int current = 0;
        for(int i = 0; i <= max; i++){
            current += path[i];
            if(capacity<current){
                return false;
            }
        }
        return true;
    }


}
