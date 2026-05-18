package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class LoopRemover {
    public static void main(String[] args) {
        LoopRemover main = new LoopRemover();
    }


    public List<Character> optimize(List<Character> directions) {
        LinkedList<Character> route = new LinkedList<>();
        HashSet<String> visited = new HashSet<>();

        int xcur=0;
        int ycur=0;
        visited.add(getPoint(xcur, ycur));
        for(int i = 0; i<directions.size(); i++){
            Character cur = directions.get(i);
            if(cur == 'U'){
                ycur++;
            }else if(cur == 'D'){
                ycur--;
            } else if(cur == 'R'){
                xcur++;
            } else {
                xcur--;
            }
            route.add(cur);

            boolean loopExists = visited.contains(getPoint(xcur, ycur));
            if(loopExists){
                String crossroad = getPoint(xcur, ycur);
                do{
                    char last = route.getLast();
                    visited.remove(getPoint(xcur, ycur));

                    if(last == 'U'){
                        ycur--;
                    }else if(last == 'D'){
                        ycur++;
                    } else if(last == 'R'){
                        xcur--;
                    } else {
                        xcur++;
                    }

                    route.removeLast();

                } while(!crossroad.equals(getPoint(xcur, ycur)));
            }
            visited.add(getPoint(xcur, ycur));
        }

        return route;
    }

    private static String getPoint(int x, int y) {
        return x + ", " + y;
    }


}
