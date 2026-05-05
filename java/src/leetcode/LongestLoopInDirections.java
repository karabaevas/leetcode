package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestLoopInDirections {
    public static void main(String[] args) {
        LongestLoopInDirections main = new LongestLoopInDirections();



    }

    //            RRLUUURDLL -> (5, 8), в данном маршруте две петли (R RL UU URDL L), вторая является более длинной
//            LUULD -> null, в данном маршруте нет петель
// LR
    //    23 05
    public int[] longestLoop(String directions) {
        int x = 0;
        int y = 0;

        Map<String, Integer> map =  new HashMap<>();
        map.put(x+","+y, -1);
        int loopLength = 0;
        int[] res = new int[] {-1,-1};

        for(int i = 0; i<directions.length(); i++){
            char ch = directions.charAt(i);

            if(ch == 'U'){
                y++;
            } else if(ch == 'D'){
                y--;
            } else if(ch == 'L'){
                x--;
            } else {
                x++;
            }

            String key = x + "," + y;
            Integer prev = map.get(key);
            if(prev != null) {
                if(loopLength < i - prev + 1){
                    loopLength = i - prev + 1;
                    res[0] = prev+1;
                    res[1] = i;
                }

            }
            map.put(key, i);
        }

        return res;
    }


}
